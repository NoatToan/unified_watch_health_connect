package xg1;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.v;
import aq.z;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxg1/g;", "Landroidx/fragment/app/i;", "Lxg1/s;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends androidx.fragment.app.i implements s<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f190896b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i<Integer> f190897a;

    @Override // xg1.s
    public final void X4(i<Integer> iVar) {
        this.f190897a = iVar;
    }

    @Override // xg1.s
    public final void g(v vVar) {
        vVar.getClass();
        show(vVar, "LengthDialogFragment");
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i14 = arguments != null ? arguments.getInt("length") : 14;
        Bundle arguments2 = getArguments();
        int i15 = arguments2 != null ? arguments2.getInt("minValue") : 14;
        rk1.b.e eVar = new rk1.b.e(getActivity());
        androidx.fragment.app.m activity = getActivity();
        eVar.f153344b.f153346b = activity != null ? activity.getString(R.string.lbl_distance) : null;
        eVar.d(150);
        eVar.e(i15);
        eVar.c(Integer.valueOf(i14));
        eVar.f153344b.f153345a = 1;
        eVar.f(new z(this, 5));
        androidx.appcompat.app.e eVarB = eVar.b();
        eVarB.getClass();
        return eVarB;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxg1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "POOL_LENGTH", "MINIMUM_VALUE", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
