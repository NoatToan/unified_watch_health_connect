package ro0;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.garmin.android.gncs.NotificationConstants;
import lc.q0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lro0/m;", "Landroid/os/Parcelable;", "D", "Llc/q0;", "Ljava/lang/Class;", NotificationConstants.KEY_DATA_MIME_TYPE, "Landroid/os/Parcelable$Creator;", "parcelableCreator", "", "bundleKey", "<init>", "(Ljava/lang/Class;Landroid/os/Parcelable$Creator;Ljava/lang/String;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m<D extends Parcelable> extends q0<D> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f153860v = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Parcelable.Creator<D> f153861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f153862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q0.e<D> f153863u;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Class<D> cls, Parcelable.Creator<D> creator, String str) {
        super(true);
        cls.getClass();
        creator.getClass();
        str.getClass();
        this.f153861s = creator;
        this.f153862t = str;
        this.f153863u = new q0.e<>(cls);
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        this.f153863u.getClass();
        String str2 = this.f153862t;
        str2.getClass();
        return (Parcelable) bundle.get(str2);
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        Parcelable.Creator<D> creator = this.f153861s;
        byte[] bArrDecode = Base64.decode(str, 0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            D dCreateFromParcel = creator.createFromParcel(parcelObtain);
            dCreateFromParcel.getClass();
            return dCreateFromParcel;
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        str.getClass();
        parcelable.getClass();
        this.f153863u.e(bundle, this.f153862t, (D) parcelable);
    }

    @Override // lc.q0
    public final String f(Object obj) {
        Parcelable parcelable = (Parcelable) obj;
        parcelable.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            String strEncodeToString = Base64.encodeToString(parcelObtain.marshall(), 0);
            strEncodeToString.getClass();
            parcelObtain.recycle();
            String strEncode = Uri.encode(strEncodeToString);
            strEncode.getClass();
            return strEncode;
        } catch (Throwable th3) {
            parcelObtain.recycle();
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/m$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
