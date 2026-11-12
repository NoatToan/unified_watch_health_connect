package com.google.firebase.perf.injection.components;

import androidx.annotation.NonNull;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import dagger.Component;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
@Component(modules = {FirebasePerformanceModule.class})
@Singleton
public interface FirebasePerformanceComponent {
    @NonNull
    FirebasePerformance getFirebasePerformance();
}
