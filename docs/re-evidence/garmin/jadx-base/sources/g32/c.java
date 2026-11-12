package g32;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import e23.l;
import e32.p;
import g12.f;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg32/c;", "Data", "Le32/p;", "ViewBinder", "NavigatorDestination", "Le32/c;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c<Data, ViewBinder extends p<Data>, NavigatorDestination> extends e32.c<Data, ViewBinder, NavigatorDestination> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f75712p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g32.a<Data> f75713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f75714o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f75715a;

        public a(l lVar) {
            lVar.getClass();
            this.f75715a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f75715a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75715a.invoke(obj);
        }
    }

    @Override // e32.a
    public void M6(Data data) {
        super.M6(data);
        g32.a<Data> aVar = this.f75713n;
        if (aVar != null) {
            View view2 = aVar.f75704a;
            boolean z14 = aVar.f75706c;
            b<Data> bVar = aVar.f75705b;
            boolean zC = bVar.c(data);
            aVar.f75708e = zC;
            if (aVar.f75707d && zC) {
                if (z14 && bVar.a()) {
                    view2.setVisibility(0);
                } else {
                    if (z14 || !bVar.b()) {
                        return;
                    }
                    view2.setVisibility(0);
                }
            }
        }
    }

    public b<Data> X6() {
        return null;
    }

    public final void Y6() {
        g32.a<Data> aVar = this.f75713n;
        if (aVar != null) {
            View view2 = aVar.f75704a;
            b<Data> bVar = aVar.f75705b;
            boolean z14 = aVar.f75706c;
            aVar.f75707d = true;
            if (aVar.f75708e) {
                if (z14 && bVar.a()) {
                    view2.setVisibility(0);
                } else if (!z14 && bVar.b()) {
                    view2.setVisibility(0);
                }
            }
            b.f75709a.getClass();
            y0<Unit> y0Var = new y0<>();
            b.a.f75711b = y0Var;
            y0Var.f(getViewLifecycleOwner(), new a(new f(aVar, 6)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f75714o) {
            Y6();
        }
    }

    @Override // e32.c, e32.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        String string;
        CharSequence text;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        b<Data> bVarX6 = X6();
        if (bVarX6 != null) {
            View viewFindViewById = requireView().findViewById(R.id.tool_tip_container);
            viewFindViewById.getClass();
            TextView textView = (TextView) requireView().findViewById(R.id.tool_tip_label);
            Context contextRequireContext = requireContext();
            if (textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) {
                string = "";
            }
            String string2 = contextRequireContext.getString(R.string.lbl_tooltip_value, string);
            string2.getClass();
            e.f(viewFindViewById, string2);
            this.f75713n = new g32.a<>(viewFindViewById, bVarX6);
            viewFindViewById.setOnClickListener(new x(this, 25));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setMenuVisibility(boolean z14) {
        super.setMenuVisibility(z14);
        this.f75714o = z14;
        if (z14) {
            Y6();
        }
    }
}
