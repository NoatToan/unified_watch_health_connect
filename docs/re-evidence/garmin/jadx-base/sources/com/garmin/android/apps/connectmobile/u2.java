package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.Intent;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/u2;", "", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f46492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o82.g f46493b = o82.g.f130850c;

    static {
        new a(null);
    }

    public final <T extends c> Intent a(Context context, Class<T> cls) {
        if (context == null) {
            return new Intent();
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("EXTRA_INITIAL_DATE", this.f46492a);
        intent.putExtra("EXTRA_SELECTED_INTERVAL_TYPE", this.f46493b);
        return intent;
    }

    public final void b(o82.g gVar) {
        gVar.getClass();
        this.f46493b = gVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/u2$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_INTERVAL_TYPE", "Ljava/lang/String;", "EXTRA_INITIAL_DATE", "EXTRA_SHOW_EDIT_WEIGHT_GOAL", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
