package com.garmin.android.apps.connectmobile.incidentdetection.model;

import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "b", "c", "a", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a$b;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a$c;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0658a f36864b = new C0658a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36865a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a$b;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {
        public b() {
            super("FITNESSAPP", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a$c;", "Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a;", "<init>", "()V", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {
        public c() {
            super("WEARABLE", null);
        }
    }

    private a(String str) {
        this.f36865a = str;
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.incidentdetection.model.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/incidentdetection/model/a$a;", "", "<init>", "()V", "", "FITNESSAPP", "Ljava/lang/String;", "WEARABLE", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0658a {
        public /* synthetic */ C0658a(j jVar) {
            this();
        }

        private C0658a() {
        }
    }

    public /* synthetic */ a(String str, j jVar) {
        this(str);
    }
}
