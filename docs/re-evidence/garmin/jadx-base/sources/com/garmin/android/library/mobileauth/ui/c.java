package com.garmin.android.library.mobileauth.ui;

import android.app.AlertDialog;
import android.content.Context;
import bi2.k;
import e23.p;
import en0.m;
import java.util.LinkedHashSet;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/c;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50424a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/library/mobileauth/ui/c$a;", "", "<init>", "()V", "a", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: com.garmin.android.library.mobileauth.ui.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC1004a {
            void d(ve2.e eVar);

            void g();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/e;", "<anonymous>", "(Lo53/b0;)Lve2/e;"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.android.library.mobileauth.ui.MobileAuthSwitchEnvironmentDialog$Companion$create$currentEnv$1", f = "MobileAuthSwitchEnvironmentDialog.kt", l = {31}, m = "invokeSuspend")
        public static final class b extends i implements p<b0, t13.d<? super ve2.e>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f50425a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super ve2.e> dVar) {
                return new b(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f50425a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                re2.b bVar = re2.b.f152215a;
                this.f50425a = 1;
                bVar.getClass();
                Object objQ = re2.b.q(this);
                return objQ == aVar ? aVar : objQ;
            }
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public static AlertDialog a(Context context, InterfaceC1004a interfaceC1004a) {
            ve2.e eVar = (ve2.e) ge1.b.W(t13.h.f161748a, new b(null));
            re2.b.f152215a.getClass();
            LinkedHashSet<ve2.e> linkedHashSet = re2.b.m().D;
            if (linkedHashSet == null) {
                s.m("appSupportedEnvironments");
                throw null;
            }
            String[] strArr = new String[linkedHashSet.size()];
            int i14 = -1;
            int i15 = 0;
            for (Object obj : linkedHashSet) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                ve2.e eVar2 = (ve2.e) obj;
                strArr[i15] = eVar2.name();
                if (eVar == eVar2) {
                    i14 = i15;
                }
                i15 = i16;
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle("Environment").setCancelable(true).setOnCancelListener(new m(interfaceC1004a, 2)).setSingleChoiceItems(strArr, i14, new k(eVar, 29, strArr, interfaceC1004a)).create();
            alertDialogCreate.getClass();
            return alertDialogCreate;
        }

        private a() {
        }
    }
}
