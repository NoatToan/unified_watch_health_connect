package com.miui.circulate.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.miui.circulate.api.service.CirculateServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public class CirculateParam implements Parcelable {
    public static final String ABILITY_LYRA = "abilityLyra";
    public static final String APP_NAME = "appName";
    public static final Parcelable.Creator<CirculateParam> CREATOR = new a();
    public static final String CROSS_PROTOCOL = "cross_protocol";
    public static final String PACKAGE_NAME = "packageName";
    public static final String REF = "ref";
    public static final String TASK_ID = "taskId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CirculateServiceInfo f10282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExtraBundle f10283b;
    public final CirculateServiceInfo c;

    public class a implements Parcelable.Creator<CirculateParam> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CirculateParam createFromParcel(Parcel parcel) {
            return new CirculateParam(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CirculateParam[] newArray(int i) {
            return new CirculateParam[i];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CirculateServiceInfo f10284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ExtraBundle f10285b;
        public CirculateServiceInfo c;

        public CirculateParam d() {
            return new CirculateParam(this, null);
        }

        public b e(CirculateServiceInfo circulateServiceInfo) {
            this.f10284a = circulateServiceInfo;
            return this;
        }

        public b f(CirculateServiceInfo circulateServiceInfo) {
            this.c = circulateServiceInfo;
            return this;
        }
    }

    public /* synthetic */ CirculateParam(b bVar, a aVar) {
        this(bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10282a, i);
        parcel.writeParcelable(this.f10283b, i);
        parcel.writeParcelable(this.c, i);
    }

    public CirculateParam(b bVar) {
        this.f10282a = bVar.f10284a;
        this.f10283b = bVar.f10285b;
        this.c = bVar.c;
    }

    public CirculateParam(Parcel parcel) {
        this.f10282a = (CirculateServiceInfo) parcel.readParcelable(CirculateServiceInfo.class.getClassLoader());
        this.f10283b = (ExtraBundle) parcel.readParcelable(ExtraBundle.class.getClassLoader());
        this.c = (CirculateServiceInfo) parcel.readParcelable(CirculateServiceInfo.class.getClassLoader());
    }
}
