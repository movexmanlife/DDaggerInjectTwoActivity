package com.robot.ddagger.maincomponent;


import com.robot.ddagger.MainActivity;
import com.robot.ddagger.bean.NumberView;
import com.robot.ddagger.bean.Student;
import com.robot.ddagger.component.AppComponent;
import com.robot.ddagger.component.PerActivity;

import javax.inject.Singleton;

import dagger.Component;

@PerActivity
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
