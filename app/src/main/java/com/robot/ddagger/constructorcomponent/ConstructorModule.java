package com.robot.ddagger.constructorcomponent;

import android.app.Activity;
import android.content.Context;

import com.robot.ddagger.bean.NumberView;
import com.robot.ddagger.bean.Student;
import com.robot.ddagger.component.PerActivity;

import dagger.Module;
import dagger.Provides;


@PerActivity
@Module
public class ConstructorModule {

    public ConstructorModule() {
    }
}
