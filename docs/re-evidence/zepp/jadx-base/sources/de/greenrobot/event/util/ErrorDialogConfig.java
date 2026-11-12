package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public class ErrorDialogConfig {
    public final Resources a;
    public final int b;
    public final int c;
    public EventBus e;
    public String g;
    public int h;
    public Class<?> i;
    public boolean f = true;
    public final ExceptionToResourceMapping d = new ExceptionToResourceMapping();

    public ErrorDialogConfig(Resources resources, int i, int i2) {
        this.a = resources;
        this.b = i;
        this.c = i2;
    }

    public EventBus a() {
        EventBus eventBus = this.e;
        return eventBus != null ? eventBus : EventBus.getDefault();
    }

    public ErrorDialogConfig addMapping(Class<? extends Throwable> cls, int i) {
        this.d.addMapping(cls, i);
        return this;
    }

    public void disableExceptionLogging() {
        this.f = false;
    }

    public int getMessageIdForThrowable(Throwable th) {
        Integer numMapThrowable = this.d.mapThrowable(th);
        if (numMapThrowable != null) {
            return numMapThrowable.intValue();
        }
        Log.d(EventBus.TAG, "No specific message ressource ID found for " + th);
        return this.c;
    }

    public void setDefaultDialogIconId(int i) {
        this.h = i;
    }

    public void setDefaultEventTypeOnDialogClosed(Class<?> cls) {
        this.i = cls;
    }

    public void setEventBus(EventBus eventBus) {
        this.e = eventBus;
    }

    public void setTagForLoggingExceptions(String str) {
        this.g = str;
    }
}
