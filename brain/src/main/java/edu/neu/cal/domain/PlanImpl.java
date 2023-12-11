/*
 * @Author: Jiang Han
 * @Date: 2023-11-27 17:10:52
 * @Description: 
 */
package edu.neu.cal.domain;

import java.util.Arrays;

/**
 * @author Haipeng Wang
 * @since 2023/11/26
 */

// TODO: 这个类应该叫HealthGoalImpl，而不是PlanImpl，接口待完善
// TODO: 方法写注释
public class PlanImpl {
    /**
     * 计划信息
     */
    Plan plan;
    /**
     * 实际卡路里摄入量
     */
    private double[] actualCalorieIntake;
    /**
     * 实际运动量
     */
    private double[] actualExerciseTime;
    /**
     * 体重记录
     */
    private double[] weightRecord;

    public PlanImpl(Plan plan) {
        this.plan = plan;
        actualCalorieIntake = new double[plan.getDays()];
        actualExerciseTime = new double[plan.getDays()];
        weightRecord = new double[plan.getDays()];
    }

    public double[] getActualCalorieIntake() {
        return actualCalorieIntake;
    }

    public void setActualCalorieIntakeForAll(double[] actualCalorieIntake) {
        this.actualCalorieIntake = actualCalorieIntake;
    }

    public void setActualCalorieIntakeForOneDay(double actualCalorieIntake, int day) {
        this.actualCalorieIntake[day - 1] = actualCalorieIntake;
    }

    public double[] getActualExerciseTime() {
        return actualExerciseTime;
    }

    public void setActualExerciseTimeForAll(double[] actualExerciseTime) {
        this.actualExerciseTime = actualExerciseTime;
    }

    public void setActualExerciseTimeForOneDay(double actualExerciseTime, int day) {
        this.actualExerciseTime[day - 1] = actualExerciseTime;
    }

    public double[] getWeightRecord() {
        return weightRecord;
    }

    public void setWeightRecordForAll(double[] weightRecord) {
        this.weightRecord = weightRecord;
    }

    public void setWeightRecordForOneDay(double weightRecord, int day) {
        this.weightRecord[day - 1] = weightRecord;
    }

    public String toString() {
        return "UserPlan{" +
                "plan=" + plan +
                ", actualCalorieIntake=" + Arrays.toString(actualCalorieIntake) +
                ", actualExerciseTime=" + Arrays.toString(actualExerciseTime) +
                ", weightRecord=" + Arrays.toString(weightRecord) +
                '}';
    }

    public double[] getPlanCalorieIntake() {
        return null;
    }
}
