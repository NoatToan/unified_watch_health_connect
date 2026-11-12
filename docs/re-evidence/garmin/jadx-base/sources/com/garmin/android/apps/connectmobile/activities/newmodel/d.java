package com.garmin.android.apps.connectmobile.activities.newmodel;

import com.garmin.android.apps.connectmobile.f3;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/d;", "", "<init>", "()V", "a", "b", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/d$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/d$b;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/d$a;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/d;", "", "fileName", "", "byteArray", "<init>", "(Ljava/lang/String;[B)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f29411b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, byte[] bArr) {
            super(null);
            str.getClass();
            bArr.getClass();
            this.f29410a = str;
            this.f29411b = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f29410a, aVar.f29410a) && Arrays.equals(this.f29411b, aVar.f29411b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f29411b) + (this.f29410a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("ProcessedImage(fileName=", this.f29410a, ", byteArray=", Arrays.toString(this.f29411b), ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/newmodel/d$b;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/d;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f29412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(null);
            exc.getClass();
            this.f29412a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f29412a, ((b) obj).f29412a);
        }

        public final int hashCode() {
            return this.f29412a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f29412a, "ProcessedImageError(exception=", ")");
        }
    }

    public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private d() {
    }
}
