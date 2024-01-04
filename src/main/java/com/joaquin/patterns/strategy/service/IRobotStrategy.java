package com.joaquin.patterns.strategy.service;

public interface IRobotStrategy {
    RobotType getType();
    String getWayToMove();
}
