package com.joaquin.patterns.strategy.service;

import org.springframework.stereotype.Component;

@Component
public class RobotRoomba implements IRobotStrategy{
    @Override
    public RobotType getType() {
        return RobotType.ROOMBA;
    }

    @Override
    public String getWayToMove() {
        return "Desliza";
    }
}
