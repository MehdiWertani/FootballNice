package com.test.FootballNice.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.test.FootballNice.dtos.JoueurDto;
import com.test.FootballNice.entities.Joueur;

@Mapper(componentModel = "spring")
public interface JoueurMapper {
    JoueurDto toDTO(Joueur joueur);
    Joueur toEntity(JoueurDto joueurDto);
}
