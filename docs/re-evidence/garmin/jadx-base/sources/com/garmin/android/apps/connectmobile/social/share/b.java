package com.garmin.android.apps.connectmobile.social.share;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.b0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import d53.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import p13.x;
import p13.y;
import ro1.h;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/b;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "b", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44643d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Intent f44644a = new Intent();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f44645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0845b f44646c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.share.b$b, reason: collision with other inner class name */
    public interface InterfaceC0845b {
        default void T() {
        }

        void i8(ro1.e eVar, Intent intent);
    }

    @Override // androidx.fragment.app.i
    public final int getTheme() {
        return 2132149233;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f44646c = (InterfaceC0845b) context;
        } catch (ClassCastException unused) {
            g.u(context, " must implement OnPickAppListener");
        }
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        InterfaceC0845b interfaceC0845b = this.f44646c;
        if (interfaceC0845b != null) {
            interfaceC0845b.T();
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.share_app_picker_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        Object next;
        String str;
        String lowerCase;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.app_list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList arrayListA = ro1.e.a(requireContext(), this.f44644a);
        bv.b.f21239a.getClass();
        bv.b.a();
        String strB = b0.b(null);
        c.f44647c.getClass();
        Iterator<T> it = c.f44650f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str = ((c) next).f44651a;
            lowerCase = strB.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
        } while (!s.g(str, lowerCase));
        c cVar = (c) next;
        if (cVar == null) {
            cVar = c.f44648d;
        }
        List<ro1.g> list = cVar.f44652b;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(new p(((ro1.g) obj).f153956a, Integer.valueOf(i14)));
            i14 = i15;
        }
        Map mapL = u0.l(arrayList);
        if (this.f44645b) {
            Intent intent = this.f44644a;
            if (s.g(intent != null ? intent.getType() : null, "text/plain")) {
                Iterator it3 = arrayListA.iterator();
                while (it3.hasNext()) {
                    if (s.g(((ro1.e) it3.next()).f153929a.packageName, "com.tencent.mm")) {
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.setType("image/*");
                        intent2.addFlags(1);
                        for (ro1.e eVar : ro1.e.a(requireContext(), intent2)) {
                            if (s.g(eVar.f153929a.packageName, "com.tencent.mm")) {
                                String str2 = eVar.f153929a.name;
                                str2.getClass();
                                if (w.z(str2, "TimeLine", false)) {
                                    arrayListA.add(eVar);
                                }
                            }
                        }
                        break;
                    }
                }
            }
        } else {
            Iterator it4 = arrayListA.iterator();
            while (it4.hasNext()) {
                ro1.e eVar2 = (ro1.e) it4.next();
                if (s.g(eVar2.f153929a.packageName, "com.tencent.mm")) {
                    String str3 = eVar2.f153929a.name;
                    str3.getClass();
                    if (!w.z(str3, "ShareImgUI", false)) {
                        it4.remove();
                    }
                }
            }
        }
        Collections.sort(arrayListA, new h(mapL));
        recyclerView.setAdapter(new ro1.f(arrayListA, new qw0.y(this, 16)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/b$a;", "", "<init>", "()V", "", "MIME_TYPE_TEXT", "Ljava/lang/String;", "MIME_TYPE_IMAGES", "WECHAT_PACKAGE_NAME", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static b a(Intent intent, boolean z14) {
            intent.getClass();
            b bVar = new b();
            bVar.f44644a = intent;
            bVar.f44645b = z14;
            return bVar;
        }

        private a() {
        }
    }
}
