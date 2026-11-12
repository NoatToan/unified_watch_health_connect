package cx2;

import android.content.Context;
import android.util.Base64;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.realtimesettings.app.baseviews.views.StyledTextView;
import d53.w;
import e23.p;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.util.ExtensionFunctionsKt$setRtsIcon$1", f = "ExtensionFunctions.kt", l = {122}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppCompatImageView f56675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zw2.g.c f56676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f56677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AppCompatImageView appCompatImageView, zw2.g.c cVar, int i14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f56675b = appCompatImageView;
            this.f56676c = cVar;
            this.f56677d = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f56675b, this.f56676c, this.f56677d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f56674a;
            if (i14 == 0) {
                r.b(obj);
                ex2.i iVar = ex2.i.f66970a;
                Context context = this.f56675b.getContext();
                context.getClass();
                zw2.g.c cVar = this.f56676c;
                String str = cVar.f207294a;
                String str2 = cVar.f207295b;
                Long l14 = cVar.f207296c;
                Long l15 = cVar.f207297d;
                this.f56674a = 1;
                if (iVar.f(context, str, str2, l14, l15, this.f56675b, this.f56677d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final String a(String str) {
        str.getClass();
        try {
            Charset charset = d53.c.f57666b;
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            byte[] bArrDecode = Base64.decode(bytes, 0);
            bArrDecode.getClass();
            return new String(bArrDecode, charset);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final tv2.c b(Map<String, ? extends Object> map) {
        String str;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        Object obj = map != null ? map.get(gw2.i.HANDLE.f79975a) : null;
        try {
            if (!(obj instanceof String)) {
                obj = null;
            }
            str = (String) obj;
        } catch (ClassCastException unused) {
            str = null;
        }
        Object obj2 = map != null ? map.get(gw2.i.APP_HANDLE.f79975a) : null;
        try {
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            str2 = (String) obj2;
        } catch (ClassCastException unused2) {
            str2 = null;
        }
        Object obj3 = map != null ? map.get(gw2.i.FORMAT_ARGS_HANDLES.f79975a) : null;
        try {
            if (!(obj3 instanceof ArrayList)) {
                obj3 = null;
            }
            arrayList = (ArrayList) obj3;
        } catch (ClassCastException unused3) {
            arrayList = null;
        }
        Object obj4 = map != null ? map.get(gw2.i.FORMAT_ARGS.f79975a) : null;
        try {
            if (!(obj4 instanceof ArrayList)) {
                obj4 = null;
            }
            arrayList2 = (ArrayList) obj4;
        } catch (ClassCastException unused4) {
            arrayList2 = null;
        }
        Object obj5 = map != null ? map.get(gw2.i.TEXT.f79975a) : null;
        try {
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            str3 = (String) obj5;
        } catch (ClassCastException unused5) {
            str3 = null;
        }
        return new tv2.c(str, str2, arrayList, arrayList2, str3);
    }

    public static final boolean c(Fragment fragment) {
        fragment.getClass();
        return fragment.isAdded() && fragment.getActivity() != null;
    }

    public static final boolean d(Context context, String str) {
        if (str != null && str.length() != 0) {
            if (context != null) {
                return da2.d.c(context).a(str) != null;
            }
            if (da2.d.b().a(str) != null) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(m mVar) {
        return mVar.getF158016a().getF7973d().a(androidx.lifecycle.b0.b.RESUMED);
    }

    public static final void f(AppCompatImageView appCompatImageView, zw2.g.c cVar, b0 b0Var, int i14) {
        appCompatImageView.getClass();
        b0Var.getClass();
        if (cVar == null) {
            appCompatImageView.setVisibility(8);
            return;
        }
        String str = cVar.f207295b;
        String str2 = cVar.f207294a;
        if (str2 == null || w.J(str2) || str == null || str.length() == 0) {
            appCompatImageView.setVisibility(8);
        } else if (str.equals("NO_ICON")) {
            appCompatImageView.setVisibility(4);
        } else {
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(b0Var, o.f168762a, null, new a(appCompatImageView, cVar, i14, null), 2);
        }
    }

    public static final void g(StyledTextView styledTextView, String str) {
        styledTextView.getClass();
        if (str == null || str.length() == 0) {
            styledTextView.setVisibility(8);
            return;
        }
        styledTextView.setVisibility(0);
        styledTextView.setText(str);
        dw2.a.f61447a.getClass();
        h hVar = dw2.a.f61448b;
        str.getClass();
        com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
        HashMap<String, String> map = com.garmin.realtimesettings.app.initialization.b.f52595g;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String str2 = map.get(lowerCase);
        if (str2 != null) {
            hVar.getClass();
        } else {
            hVar.getClass();
            str2 = null;
        }
        if (str2 != null) {
            styledTextView.setContentDescription(str2);
        }
    }
}
