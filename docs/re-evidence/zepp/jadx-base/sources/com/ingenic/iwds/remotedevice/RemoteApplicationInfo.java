package com.ingenic.iwds.remotedevice;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteApplicationInfo implements Parcelable {
    public static final Parcelable.Creator<RemoteApplicationInfo> CREATOR = new a();
    private String a;
    public ApplicationInfo applicationInfo;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private String g;
    private String h;
    private int i;
    public Bitmap iconBitmap;
    private int j;
    private int k;
    private int l;
    public CharSequence label;
    private int m;
    private String n;
    private String o;
    private String p;
    public String packageName;
    private String q;
    private int r;
    private int s;
    private boolean t;
    private byte[] u;
    private String v;
    public int versionCode;
    public String versionName;
    private int w;
    private long x;
    private long y;

    public static class a implements Parcelable.Creator<RemoteApplicationInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteApplicationInfo createFromParcel(Parcel parcel) {
            return new RemoteApplicationInfo(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteApplicationInfo[] newArray(int i) {
            return new RemoteApplicationInfo[i];
        }
    }

    public /* synthetic */ RemoteApplicationInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    private byte[] a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private Bitmap b(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    private Bitmap c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ApplicationInfo getLocalApplicationInfo() {
        return this.applicationInfo;
    }

    public String toString() {
        return "RemoteApplicationInfo{" + Integer.toHexString(System.identityHashCode(this)) + " " + this.packageName + i.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.f);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.q);
        parcel.writeString(this.p);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.e);
        parcel.writeInt(this.i);
        parcel.writeInt(this.u.length);
        parcel.writeByteArray(this.u);
        TextUtils.writeToParcel(this.label, parcel, i);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.versionName);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeLong(this.x);
        parcel.writeLong(this.y);
    }

    public RemoteApplicationInfo(PackageManager packageManager, PackageInfo packageInfo) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.t = true;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        this.a = applicationInfo.taskAffinity;
        this.b = applicationInfo.permission;
        this.c = applicationInfo.processName;
        this.d = applicationInfo.className;
        this.f = applicationInfo.theme;
        this.j = applicationInfo.flags;
        this.k = applicationInfo.requiresSmallestWidthDp;
        this.l = applicationInfo.compatibleWidthLimitDp;
        this.m = applicationInfo.largestWidthLimitDp;
        this.n = applicationInfo.sourceDir;
        this.o = applicationInfo.publicSourceDir;
        this.q = applicationInfo.nativeLibraryDir;
        this.p = applicationInfo.dataDir;
        this.r = applicationInfo.uid;
        this.s = applicationInfo.targetSdkVersion;
        this.t = applicationInfo.enabled;
        this.g = applicationInfo.manageSpaceActivityName;
        this.e = applicationInfo.descriptionRes;
        this.i = applicationInfo.uiOptions;
        this.h = applicationInfo.backupAgentName;
        this.u = a(c(packageManager.getApplicationIcon(applicationInfo)));
        this.label = packageInfo.applicationInfo.loadLabel(packageManager);
        this.packageName = packageInfo.packageName;
        this.versionCode = packageInfo.versionCode;
        this.versionName = packageInfo.versionName;
        this.v = packageInfo.sharedUserId;
        this.w = packageInfo.sharedUserLabel;
        this.x = packageInfo.firstInstallTime;
        this.y = packageInfo.lastUpdateTime;
    }

    private RemoteApplicationInfo(Parcel parcel) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.t = true;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        this.applicationInfo = applicationInfo;
        String string = parcel.readString();
        this.a = string;
        applicationInfo.taskAffinity = string;
        ApplicationInfo applicationInfo2 = this.applicationInfo;
        String string2 = parcel.readString();
        this.b = string2;
        applicationInfo2.permission = string2;
        ApplicationInfo applicationInfo3 = this.applicationInfo;
        String string3 = parcel.readString();
        this.c = string3;
        applicationInfo3.processName = string3;
        ApplicationInfo applicationInfo4 = this.applicationInfo;
        String string4 = parcel.readString();
        this.d = string4;
        applicationInfo4.className = string4;
        ApplicationInfo applicationInfo5 = this.applicationInfo;
        int i = parcel.readInt();
        this.f = i;
        applicationInfo5.theme = i;
        ApplicationInfo applicationInfo6 = this.applicationInfo;
        int i2 = parcel.readInt();
        this.j = i2;
        applicationInfo6.flags = i2;
        ApplicationInfo applicationInfo7 = this.applicationInfo;
        int i3 = parcel.readInt();
        this.k = i3;
        applicationInfo7.requiresSmallestWidthDp = i3;
        ApplicationInfo applicationInfo8 = this.applicationInfo;
        int i4 = parcel.readInt();
        this.l = i4;
        applicationInfo8.compatibleWidthLimitDp = i4;
        ApplicationInfo applicationInfo9 = this.applicationInfo;
        int i5 = parcel.readInt();
        this.m = i5;
        applicationInfo9.largestWidthLimitDp = i5;
        ApplicationInfo applicationInfo10 = this.applicationInfo;
        String string5 = parcel.readString();
        this.n = string5;
        applicationInfo10.sourceDir = string5;
        ApplicationInfo applicationInfo11 = this.applicationInfo;
        String string6 = parcel.readString();
        this.o = string6;
        applicationInfo11.publicSourceDir = string6;
        ApplicationInfo applicationInfo12 = this.applicationInfo;
        String string7 = parcel.readString();
        this.q = string7;
        applicationInfo12.nativeLibraryDir = string7;
        ApplicationInfo applicationInfo13 = this.applicationInfo;
        String string8 = parcel.readString();
        this.p = string8;
        applicationInfo13.dataDir = string8;
        ApplicationInfo applicationInfo14 = this.applicationInfo;
        int i6 = parcel.readInt();
        this.r = i6;
        applicationInfo14.uid = i6;
        ApplicationInfo applicationInfo15 = this.applicationInfo;
        int i7 = parcel.readInt();
        this.s = i7;
        applicationInfo15.targetSdkVersion = i7;
        ApplicationInfo applicationInfo16 = this.applicationInfo;
        boolean z = parcel.readInt() != 0;
        this.t = z;
        applicationInfo16.enabled = z;
        ApplicationInfo applicationInfo17 = this.applicationInfo;
        String string9 = parcel.readString();
        this.g = string9;
        applicationInfo17.manageSpaceActivityName = string9;
        ApplicationInfo applicationInfo18 = this.applicationInfo;
        String string10 = parcel.readString();
        this.h = string10;
        applicationInfo18.backupAgentName = string10;
        ApplicationInfo applicationInfo19 = this.applicationInfo;
        int i8 = parcel.readInt();
        this.e = i8;
        applicationInfo19.descriptionRes = i8;
        ApplicationInfo applicationInfo20 = this.applicationInfo;
        int i9 = parcel.readInt();
        this.i = i9;
        applicationInfo20.uiOptions = i9;
        byte[] bArr = new byte[parcel.readInt()];
        this.u = bArr;
        parcel.readByteArray(bArr);
        this.iconBitmap = b(this.u);
        this.label = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.packageName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.versionName = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readInt();
        this.x = parcel.readLong();
        this.y = parcel.readLong();
    }
}
