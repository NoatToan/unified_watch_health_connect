package com.garmin.android.apps.connectmobile.gear.presentation;

import am.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearRoute;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m63.y1;
import o53.c2;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.t0;
import p13.c1;
import p13.u0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.q2;
import r53.p2;
import rk0.w0;
import sk0.b1;
import sk0.m1;
import sk0.n1;
import sk0.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u001c²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006 \u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006 \u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00178\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00178\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006 \u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/GearActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Ljk0/x;", "createdGear", "", "createdCollection", "collectionCreatedGear", "Lrk0/o0;", "editedGear", "editedCollection", "collectionEditedGear", "editedPhotos", "Lqk0/d;", "selectedActivityTypesResult", "Ljava/util/ArrayList;", "Luk0/a;", "Lkotlin/collections/ArrayList;", "selectedGearResult", "Lpk0/f;", "brandModelSelectionResult", "", "currentBrand", "currentModel", "enterOtherBrandState", "enterOtherModelState", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GearActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f35500b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f35501a = o13.m.b(new nk0.f(this, 0));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$a0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a0 extends lc.q0<List<? extends uk0.a>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35502s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(n63.b bVar) {
            super(true);
            this.f35502s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        public final List<? extends uk0.a> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35502s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends uk0.a> h(String str) {
            str.getClass();
            n63.b bVar = this.f35502s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends uk0.a> list) {
            str.getClass();
            n63.b bVar = this.f35502s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends uk0.a> list) {
            n63.b bVar = this.f35502s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$logPageView$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f35503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f35503a = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f35503a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            ht.a.f85464a.getClass();
            ht.a.b(this.f35503a, new o13.p[0]);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$b0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b0 extends lc.q0<x0> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35504s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(n63.b bVar) {
            super(true);
            this.f35504s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [am.x0, java.lang.Object] */
        @Override // lc.q0
        public final x0 a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35504s;
            bVar.getClass();
            return bVar.c(x0.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [am.x0, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final x0 h(String str) {
            str.getClass();
            n63.b bVar = this.f35504s;
            bVar.getClass();
            return bVar.c(x0.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, x0 x0Var) {
            str.getClass();
            n63.b bVar = this.f35504s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(x0.INSTANCE.serializer()), x0Var));
        }

        @Override // lc.q0
        public final String f(x0 x0Var) {
            n63.b bVar = this.f35504s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(x0.INSTANCE.serializer()), x0Var);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<jk0.x> f35505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b1 f35506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35507c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x3<jk0.x> x3Var, b1 b1Var, lc.v vVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f35505a = x3Var;
            this.f35506b = b1Var;
            this.f35507c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f35505a, this.f35506b, this.f35507c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            i53.e<b1.b> eVarH;
            i53.e eVarA4;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            jk0.x f182175a = this.f35505a.getF182175a();
            if (f182175a != null) {
                b1 b1Var = this.f35506b;
                b1Var.getClass();
                c80.u uVar = f182175a.f99351a;
                p2 p2Var = b1Var.f159622c;
                do {
                    value = p2Var.getValue();
                    z0Var = (z0) value;
                    i53.e<c80.u> eVar = z0Var.f159924b;
                    eVarH = z0Var.f159926d;
                    eVarA4 = b1.A4(c1.i(eVar, uVar));
                    c80.u uVar2 = z0Var.f159928f;
                    if (uVar2 == null || uVar == uVar2) {
                        eVarH = i53.a.h(c1.i(eVarH, b1.b.Gear));
                    }
                } while (!p2Var.b(value, z0.a(z0Var, false, eVarA4, null, eVarH, null, null, null, 245)));
                this.f35507c.a().f(null, "AddGearScreen_Created");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$c0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c0 extends lc.q0<List<? extends uk0.a>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35508s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(n63.b bVar) {
            super(true);
            this.f35508s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        public final List<? extends uk0.a> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35508s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends uk0.a> h(String str) {
            str.getClass();
            n63.b bVar = this.f35508s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends uk0.a> list) {
            str.getClass();
            n63.b bVar = this.f35508s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends uk0.a> list) {
            n63.b bVar = this.f35508s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$2$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f35509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b1 b1Var, lc.v vVar, x3<Boolean> x3Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f35509a = b1Var;
            this.f35510b = vVar;
            this.f35511c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f35509a, this.f35510b, this.f35511c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35511c.getF182175a(), Boolean.TRUE)) {
                p2 p2Var = this.f35509a.f159622c;
                do {
                    value = p2Var.getValue();
                    z0Var = (z0) value;
                } while (!p2Var.b(value, z0.a(z0Var, false, null, null, i53.a.h(c1.i(z0Var.f159926d, b1.b.Collections)), null, null, null, 247)));
                this.f35510b.a().f(null, "AddCollectionScreen_Created");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$d0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d0 extends lc.q0<com.garmin.android.apps.connectmobile.gear.presentation.navigation.b> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35512s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(n63.b bVar) {
            super(true);
            this.f35512s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.android.apps.connectmobile.gear.presentation.navigation.b, java.lang.Object] */
        @Override // lc.q0
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35512s;
            bVar.getClass();
            return bVar.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.garmin.android.apps.connectmobile.gear.presentation.navigation.b, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b h(String str) {
            str.getClass();
            n63.b bVar = this.f35512s;
            bVar.getClass();
            return bVar.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            str.getClass();
            n63.b bVar2 = this.f35512s;
            bVar2.getClass();
            bundle.putString(str, bVar2.b(j63.a.d(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer()), bVar));
        }

        @Override // lc.q0
        public final String f(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            n63.b bVar2 = this.f35512s;
            bVar2.getClass();
            return q2.j(bVar2, j63.a.d(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer()), bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$3$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<rk0.o0> f35513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b1 f35514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(x3<rk0.o0> x3Var, b1 b1Var, lc.v vVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f35513a = x3Var;
            this.f35514b = b1Var;
            this.f35515c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new e(this.f35513a, this.f35514b, this.f35515c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [T, i53.e<c80.u>] */
        /* JADX WARN: Type inference failed for: r13v0, types: [T, i53.e<c80.u>] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            i53.e<b1.b> eVarH;
            p005kotlin.jvm.internal.r0 r0Var;
            p005kotlin.jvm.internal.r0 r0Var2;
            boolean z14;
            boolean z15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            rk0.o0 f182175a = this.f35513a.getF182175a();
            if (f182175a != null) {
                b1 b1Var = this.f35514b;
                b1Var.getClass();
                boolean z16 = f182175a.f153246i;
                c80.u uVar = f182175a.f153239b;
                Boolean bool = f182175a.f153240c;
                c80.u uVar2 = f182175a.f153241d;
                if (f182175a.f() || f182175a.d()) {
                    p2 p2Var = b1Var.f159622c;
                    do {
                        value = p2Var.getValue();
                        z0Var = (z0) value;
                        eVarH = z0Var.f159926d;
                        r0Var = new p005kotlin.jvm.internal.r0();
                        r0Var.f105810a = z0Var.f159924b;
                        r0Var2 = new p005kotlin.jvm.internal.r0();
                        r0Var2.f105810a = z0Var.f159925c;
                        if (f182175a.d()) {
                            eVarH = i53.a.h(c1.i(eVarH, b1.b.Collections));
                        }
                        if (f182175a.f()) {
                            Boolean bool2 = Boolean.TRUE;
                            eVarH = i53.a.h(c1.i(eVarH, p005kotlin.jvm.internal.s.g(bool, bool2) ? b1.b.Retired : b1.b.Gear));
                            Boolean bool3 = f182175a.f153242e;
                            if (bool3 == null) {
                                bool3 = bool;
                            }
                            if (p005kotlin.jvm.internal.s.g(bool3, bool2)) {
                                T t7 = r0Var2.f105810a;
                                r0Var2.f105810a = uVar2 != null ? b1.A4(c1.i((Set) t7, uVar2)) : (i53.e) t7;
                                c80.u uVar3 = z0Var.f159929g;
                                if (uVar3 == null) {
                                    z15 = true;
                                } else {
                                    if ((uVar2 == null ? uVar : uVar2) == uVar3) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                }
                                b1.b bVar = b1.b.Retired;
                                if (!z15 || z16) {
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    eVarH = i53.a.h(c1.i(eVarH, bVar));
                                }
                            } else {
                                T t14 = r0Var.f105810a;
                                r0Var.f105810a = uVar2 != null ? b1.A4(c1.i((Set) t14, uVar2)) : (i53.e) t14;
                                c80.u uVar4 = z0Var.f159928f;
                                if (uVar4 == null) {
                                    z14 = true;
                                } else {
                                    if ((uVar2 == null ? uVar : uVar2) == uVar4) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                }
                                b1.b bVar2 = b1.b.Gear;
                                if (!z14 || z16) {
                                    bVar2 = null;
                                }
                                if (bVar2 != null) {
                                    eVarH = i53.a.h(c1.i(eVarH, bVar2));
                                }
                            }
                        }
                    } while (!p2Var.b(value, z0.a(z0Var, false, (i53.e) r0Var.f105810a, (i53.e) r0Var2.f105810a, i53.a.h(eVarH), null, null, null, 241)));
                }
                this.f35515c.a().f(null, "GearDetailsScreen_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$e0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e0 extends lc.q0<com.garmin.android.apps.connectmobile.gear.presentation.navigation.b> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35516s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(n63.b bVar) {
            super(true);
            this.f35516s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.android.apps.connectmobile.gear.presentation.navigation.b, java.lang.Object] */
        @Override // lc.q0
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35516s;
            bVar.getClass();
            return bVar.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [com.garmin.android.apps.connectmobile.gear.presentation.navigation.b, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final com.garmin.android.apps.connectmobile.gear.presentation.navigation.b h(String str) {
            str.getClass();
            n63.b bVar = this.f35516s;
            bVar.getClass();
            return bVar.c(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            str.getClass();
            n63.b bVar2 = this.f35516s;
            bVar2.getClass();
            bundle.putString(str, bVar2.b(j63.a.d(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer()), bVar));
        }

        @Override // lc.q0
        public final String f(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b bVar) {
            n63.b bVar2 = this.f35516s;
            bVar2.getClass();
            return q2.j(bVar2, j63.a.d(com.garmin.android.apps.connectmobile.gear.presentation.navigation.b.INSTANCE.serializer()), bVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$4$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f35517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b1 b1Var, lc.v vVar, x3<Boolean> x3Var, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f35517a = b1Var;
            this.f35518b = vVar;
            this.f35519c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f35517a, this.f35518b, this.f35519c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35519c.getF182175a(), Boolean.TRUE)) {
                p2 p2Var = this.f35517a.f159622c;
                do {
                    value = p2Var.getValue();
                    z0Var = (z0) value;
                } while (!p2Var.b(value, z0.a(z0Var, false, null, null, i53.a.h(c1.i(z0Var.f159926d, b1.b.Collections)), null, null, null, 247)));
                this.f35518b.a().f(null, "CollectionDetailsScreen_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$f0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f0 extends lc.q0<sk0.l0> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35520s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(n63.b bVar) {
            super(true);
            this.f35520s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, sk0.l0] */
        @Override // lc.q0
        public final sk0.l0 a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35520s;
            bVar.getClass();
            return bVar.c(sk0.l0.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, sk0.l0] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final sk0.l0 h(String str) {
            str.getClass();
            n63.b bVar = this.f35520s;
            bVar.getClass();
            return bVar.c(sk0.l0.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, sk0.l0 l0Var) {
            str.getClass();
            n63.b bVar = this.f35520s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(sk0.l0.INSTANCE.serializer()), l0Var));
        }

        @Override // lc.q0
        public final String f(sk0.l0 l0Var) {
            n63.b bVar = this.f35520s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(sk0.l0.INSTANCE.serializer()), l0Var);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$5$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f35521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b1 b1Var, lc.v vVar, x3<Boolean> x3Var, t13.d<? super g> dVar) {
            super(2, dVar);
            this.f35521a = b1Var;
            this.f35522b = vVar;
            this.f35523c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new g(this.f35521a, this.f35522b, this.f35523c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35523c.getF182175a(), Boolean.TRUE)) {
                b1 b1Var = this.f35521a;
                p2 p2Var = b1Var.f159622c;
                do {
                    value = p2Var.getValue();
                    z0Var = (z0) value;
                } while (!p2Var.b(value, z0.a(z0Var, false, null, null, i53.a.h(c1.i(z0Var.f159926d, b1.b.Gear)), null, null, null, 247)));
                b1Var.z4();
                this.f35522b.a().f(null, "ManageCollectionGearScreen_GearCreated");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$g0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g0 extends lc.q0<List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35524s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(n63.b bVar) {
            super(true);
            this.f35524s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a>] */
        @Override // lc.q0
        public final List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35524s;
            bVar.getClass();
            return bVar.c(new m63.e(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> h(String str) {
            str.getClass();
            n63.b bVar = this.f35524s;
            bVar.getClass();
            return bVar.c(new m63.e(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list) {
            str.getClass();
            n63.b bVar = this.f35524s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends com.garmin.android.apps.connectmobile.gear.presentation.navigation.a> list) {
            n63.b bVar = this.f35524s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(com.garmin.android.apps.connectmobile.gear.presentation.navigation.a.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$1$6$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b1 f35525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35527c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b1 b1Var, lc.v vVar, x3<Boolean> x3Var, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f35525a = b1Var;
            this.f35526b = vVar;
            this.f35527c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new h(this.f35525a, this.f35526b, this.f35527c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            z0 z0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35527c.getF182175a(), Boolean.TRUE)) {
                b1 b1Var = this.f35525a;
                p2 p2Var = b1Var.f159622c;
                do {
                    value = p2Var.getValue();
                    z0Var = (z0) value;
                } while (!p2Var.b(value, z0.a(z0Var, false, null, null, i53.a.h(c1.h(z0Var.f159926d, p13.x.k(b1.b.Gear, b1.b.Collections, b1.b.Retired))), null, null, null, 247)));
                b1Var.z4();
                this.f35526b.a().f(null, "CollectionDetailsScreen_GearEdited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$h0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h0 extends lc.q0<w0> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35528s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(n63.b bVar) {
            super(true);
            this.f35528s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, rk0.w0] */
        @Override // lc.q0
        public final w0 a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35528s;
            bVar.getClass();
            return bVar.c(w0.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rk0.w0] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final w0 h(String str) {
            str.getClass();
            n63.b bVar = this.f35528s;
            bVar.getClass();
            return bVar.c(w0.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, w0 w0Var) {
            str.getClass();
            n63.b bVar = this.f35528s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(w0.INSTANCE.serializer()), w0Var));
        }

        @Override // lc.q0
        public final String f(w0 w0Var) {
            n63.b bVar = this.f35528s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(w0.INSTANCE.serializer()), w0Var);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$10$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<pk0.f> f35529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<String> f35531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<String> f35532d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f35533e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f35534f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(x3<pk0.f> x3Var, lc.v vVar, p1<String> p1Var, p1<String> p1Var2, p1<Boolean> p1Var3, p1<Boolean> p1Var4, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f35529a = x3Var;
            this.f35530b = vVar;
            this.f35531c = p1Var;
            this.f35532d = p1Var2;
            this.f35533e = p1Var3;
            this.f35534f = p1Var4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new i(this.f35529a, this.f35530b, this.f35531c, this.f35532d, this.f35533e, this.f35534f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            pk0.f f182175a = this.f35529a.getF182175a();
            if (f182175a != null) {
                String str = f182175a.f138221b;
                String str2 = f182175a.f138220a;
                this.f35531c.setValue(str2);
                this.f35532d.setValue(str);
                this.f35533e.setValue(Boolean.valueOf(f182175a.f138222c || str2 == null || d53.w.J(str2)));
                boolean z14 = f182175a.f138223d;
                p1<Boolean> p1Var = this.f35534f;
                if (z14) {
                    p1Var.setValue(Boolean.TRUE);
                } else if (str != null) {
                    p1Var.setValue(Boolean.FALSE);
                }
                this.f35530b.a().f(null, "BrandModelSelectionResult");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$i0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i0 extends lc.q0<List<? extends y22.w>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35535s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(n63.b bVar) {
            super(true);
            this.f35535s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends y22.w>] */
        @Override // lc.q0
        public final List<? extends y22.w> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35535s;
            bVar.getClass();
            return bVar.c(new m63.e(y22.w.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends y22.w>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends y22.w> h(String str) {
            str.getClass();
            n63.b bVar = this.f35535s;
            bVar.getClass();
            return bVar.c(new m63.e(y22.w.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends y22.w> list) {
            str.getClass();
            n63.b bVar = this.f35535s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(y22.w.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends y22.w> list) {
            n63.b bVar = this.f35535s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(y22.w.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$11$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<jk0.x> f35536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ok0.t f35537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35538c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(x3<jk0.x> x3Var, ok0.t tVar, lc.v vVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f35536a = x3Var;
            this.f35537b = tVar;
            this.f35538c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new j(this.f35536a, this.f35537b, this.f35538c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:21:0x0067  */
        /* JADX WARN: Code duplicated, block: B:22:0x006d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0097 A[EDGE_INSN: B:29:0x0097->B:25:0x0097 BREAK  A[LOOP:0: B:5:0x001b->B:31:?], SYNTHETIC] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            ok0.t.c cVar;
            LinkedHashMap linkedHashMapN;
            i53.c cVar2;
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            jk0.x f182175a = this.f35536a.getF182175a();
            if (f182175a != null) {
                ok0.t tVar = this.f35537b;
                tVar.getClass();
                c80.u uVar = f182175a.f99351a;
                p2 p2Var = tVar.f132550e;
                loop0: do {
                    value = p2Var.getValue();
                    cVar = (ok0.t.c) value;
                    i53.c<uk0.a> cVar3 = cVar.f132564f.get(uVar);
                    if (cVar3 != null && !cVar3.isEmpty()) {
                        Iterator<uk0.a> it = cVar3.iterator();
                        while (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(it.next().f171795a, f182175a.f99356f)) {
                                break loop0;
                            }
                        }
                        if (f182175a.f99352b.compareTo(tVar.f132548c) > 0) {
                            break;
                            break;
                        }
                        linkedHashMapN = u0.n(cVar.f132564f);
                        cVar2 = (i53.c) linkedHashMapN.get(uVar);
                        if (cVar2 != null) {
                            arrayList = new ArrayList(cVar2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(og2.k.M(f182175a));
                        linkedHashMapN.put(uVar, i53.a.e(arrayList));
                    } else {
                        if (f182175a.f99352b.compareTo(tVar.f132548c) > 0) {
                            break;
                        }
                        linkedHashMapN = u0.n(cVar.f132564f);
                        cVar2 = (i53.c) linkedHashMapN.get(uVar);
                        if (cVar2 != null) {
                            arrayList = new ArrayList(cVar2);
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(og2.k.M(f182175a));
                        linkedHashMapN.put(uVar, i53.a.e(arrayList));
                    }
                } while (!p2Var.b(value, ok0.t.c.a(cVar, false, false, false, false, false, i53.a.g(linkedHashMapN), null, null, f182175a, 223)));
                this.f35538c.a().f(null, "AddGearScreen_Created");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$j0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j0 extends lc.q0<rk0.f0> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35539s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(n63.b bVar) {
            super(true);
            this.f35539s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, rk0.f0] */
        @Override // lc.q0
        public final rk0.f0 a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35539s;
            bVar.getClass();
            return bVar.c(rk0.f0.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, rk0.f0] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final rk0.f0 h(String str) {
            str.getClass();
            n63.b bVar = this.f35539s;
            bVar.getClass();
            return bVar.c(rk0.f0.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, rk0.f0 f0Var) {
            str.getClass();
            n63.b bVar = this.f35539s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(rk0.f0.INSTANCE.serializer()), f0Var));
        }

        @Override // lc.q0
        public final String f(rk0.f0 f0Var) {
            n63.b bVar = this.f35539s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(rk0.f0.INSTANCE.serializer()), f0Var);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$12$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<jk0.x> f35540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n1 f35541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GearActivity f35542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f35543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lc.v f35544e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(x3<jk0.x> x3Var, n1 n1Var, GearActivity gearActivity, lc.m0 m0Var, lc.v vVar, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f35540a = x3Var;
            this.f35541b = n1Var;
            this.f35542c = gearActivity;
            this.f35543d = m0Var;
            this.f35544e = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new k(this.f35540a, this.f35541b, this.f35542c, this.f35543d, this.f35544e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0064  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            m1 m1Var;
            i53.d<c80.u, i53.c<uk0.a>> dVar;
            uk0.a aVarM;
            i53.c<uk0.a> cVar;
            Object objA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            jk0.x f182175a = this.f35540a.getF182175a();
            if (f182175a != null) {
                n1 n1Var = this.f35541b;
                n1Var.getClass();
                c80.u uVar = f182175a.f99351a;
                p2 p2Var = n1Var.f159778c;
                loop0: do {
                    value = p2Var.getValue();
                    m1Var = (m1) value;
                    dVar = m1Var.f159758d;
                    i53.c<uk0.a> cVar2 = dVar.get(uVar);
                    if (cVar2 == null || cVar2.isEmpty()) {
                        aVarM = og2.k.M(f182175a);
                        cVar = dVar.get(uVar);
                        if (cVar != null || (objA = i53.a.e(p13.h0.D0(cVar, aVarM))) == null) {
                            objA = i53.a.a(aVarM);
                        }
                    } else {
                        Iterator<uk0.a> it = cVar2.iterator();
                        while (it.hasNext()) {
                            if (p005kotlin.jvm.internal.s.g(it.next().f171795a, f182175a.f99356f)) {
                                break loop0;
                            }
                        }
                        aVarM = og2.k.M(f182175a);
                        cVar = dVar.get(uVar);
                        if (cVar != null) {
                            objA = i53.a.a(aVarM);
                        } else {
                            objA = i53.a.a(aVarM);
                        }
                    }
                } while (!p2Var.b(value, m1.a(m1Var, false, false, i53.a.g(u0.i(dVar, new o13.p(uVar, objA))), f182175a, 7)));
                k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(GearRoute.j.class);
                this.f35542c.getClass();
                lc.v vVarFa = GearActivity.fa(this.f35543d, dVarB, true);
                if (vVarFa != null) {
                    vVarFa.a().f(Boolean.TRUE, "ManageCollectionGearScreen_GearCreated");
                }
                this.f35544e.a().f(null, "AddGearScreen_Created");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$k0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class k0 extends lc.q0<List<? extends y22.w>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35545s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(n63.b bVar) {
            super(true);
            this.f35545s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends y22.w>] */
        @Override // lc.q0
        public final List<? extends y22.w> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35545s;
            bVar.getClass();
            return bVar.c(new m63.e(y22.w.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends y22.w>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends y22.w> h(String str) {
            str.getClass();
            n63.b bVar = this.f35545s;
            bVar.getClass();
            return bVar.c(new m63.e(y22.w.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends y22.w> list) {
            str.getClass();
            n63.b bVar = this.f35545s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(y22.w.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends y22.w> list) {
            n63.b bVar = this.f35545s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(y22.w.INSTANCE.serializer())), list);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class l extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public l(Object obj) {
            super(0, obj, GearActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((GearActivity) this.receiver).onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$l0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l0 extends lc.q0<c80.u> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35546s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(n63.b bVar) {
            super(true);
            this.f35546s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        public final c80.u a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35546s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final c80.u h(String str) {
            str.getClass();
            n63.b bVar = this.f35546s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, c80.u uVar) {
            str.getClass();
            n63.b bVar = this.f35546s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(c80.u.INSTANCE.serializer()), uVar));
        }

        @Override // lc.q0
        public final String f(c80.u uVar) {
            n63.b bVar = this.f35546s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(c80.u.INSTANCE.serializer()), uVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GearRoute.n f35547a;

        public m(GearRoute.n nVar) {
            this.f35547a = nVar;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            GearRoute.n nVar = this.f35547a;
            return ParametersHolderKt.parametersOf(nVar.f35662a, nVar.f35663b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$m0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m0 extends lc.q0<List<? extends uk0.a>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35548s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(n63.b bVar) {
            super(true);
            this.f35548s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        public final List<? extends uk0.a> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35548s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends uk0.a>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends uk0.a> h(String str) {
            str.getClass();
            n63.b bVar = this.f35548s;
            bVar.getClass();
            return bVar.c(new m63.e(uk0.a.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends uk0.a> list) {
            str.getClass();
            n63.b bVar = this.f35548s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends uk0.a> list) {
            n63.b bVar = this.f35548s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(uk0.a.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$2$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<jk0.x> f35549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rk0.h0 f35550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(x3<jk0.x> x3Var, rk0.h0 h0Var, lc.v vVar, t13.d<? super n> dVar) {
            super(2, dVar);
            this.f35549a = x3Var;
            this.f35550b = h0Var;
            this.f35551c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new n(this.f35549a, this.f35550b, this.f35551c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            jk0.x f182175a = this.f35549a.getF182175a();
            if (f182175a != null) {
                this.f35550b.y4(f182175a);
                this.f35551c.a().f(null, "EditGearScreen_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$n0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n0 extends lc.q0<List<? extends x0>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35552s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(n63.b bVar) {
            super(true);
            this.f35552s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends am.x0>] */
        @Override // lc.q0
        public final List<? extends x0> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35552s;
            bVar.getClass();
            return bVar.c(new m63.e(x0.INSTANCE.serializer()), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends am.x0>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends x0> h(String str) {
            str.getClass();
            n63.b bVar = this.f35552s;
            bVar.getClass();
            return bVar.c(new m63.e(x0.INSTANCE.serializer()), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends x0> list) {
            str.getClass();
            n63.b bVar = this.f35552s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(x0.INSTANCE.serializer())), list));
        }

        @Override // lc.q0
        public final String f(List<? extends x0> list) {
            n63.b bVar = this.f35552s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(x0.INSTANCE.serializer())), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$2$2$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rk0.h0 f35553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(rk0.h0 h0Var, lc.v vVar, x3<Boolean> x3Var, t13.d<? super o> dVar) {
            super(2, dVar);
            this.f35553a = h0Var;
            this.f35554b = vVar;
            this.f35555c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new o(this.f35553a, this.f35554b, this.f35555c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35555c.getF182175a(), Boolean.TRUE)) {
                this.f35553a.x4();
                this.f35554b.a().f(null, "ManagePhotos_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$o0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class o0 extends lc.q0<qk0.c> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35556s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(n63.b bVar) {
            super(true);
            this.f35556s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qk0.c] */
        @Override // lc.q0
        public final qk0.c a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35556s;
            bVar.getClass();
            return bVar.c(qk0.c.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, qk0.c] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final qk0.c h(String str) {
            str.getClass();
            n63.b bVar = this.f35556s;
            bVar.getClass();
            return bVar.c(qk0.c.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, qk0.c cVar) {
            str.getClass();
            n63.b bVar = this.f35556s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(qk0.c.INSTANCE.serializer()), cVar));
        }

        @Override // lc.q0
        public final String f(qk0.c cVar) {
            n63.b bVar = this.f35556s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(qk0.c.INSTANCE.serializer()), cVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$2$3$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<qk0.d> f35557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rk0.h0 f35558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35559c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(x3<qk0.d> x3Var, rk0.h0 h0Var, lc.v vVar, t13.d<? super p> dVar) {
            super(2, dVar);
            this.f35557a = x3Var;
            this.f35558b = h0Var;
            this.f35559c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new p(this.f35557a, this.f35558b, this.f35559c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            qk0.d f182175a = this.f35557a.getF182175a();
            if (f182175a != null) {
                rk0.h0 h0Var = this.f35558b;
                p2 p2Var = h0Var.f153149d;
                ReentrantLock reentrantLock = h0Var.f153153h;
                reentrantLock.lock();
                try {
                    jk0.x xVar = ((rk0.g0) p2Var.getValue()).f153129b;
                    c2 c2Var = h0Var.f153152g;
                    if ((c2Var == null || !c2Var.isActive()) && xVar != null) {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, rk0.g0.a((rk0.g0) value, null, null, null, rk0.u0.InProgress, null, null, false, false, 247)));
                        h0Var.f153152g = ge1.b.T(v1.a(h0Var), null, null, new rk0.l0(xVar, f182175a, h0Var, null), 3);
                        Unit unit = Unit.INSTANCE;
                    }
                    reentrantLock.unlock();
                    this.f35559c.a().f(null, "MultiActivitySelectionScreen_Selected");
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$p0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class p0 extends lc.q0<c80.u> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35560s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(n63.b bVar) {
            super(true);
            this.f35560s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        public final c80.u a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35560s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final c80.u h(String str) {
            str.getClass();
            n63.b bVar = this.f35560s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, c80.u uVar) {
            str.getClass();
            n63.b bVar = this.f35560s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(c80.u.INSTANCE.serializer()), uVar));
        }

        @Override // lc.q0
        public final String f(c80.u uVar) {
            n63.b bVar = this.f35560s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(c80.u.INSTANCE.serializer()), uVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class q implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ GearRoute.m f35561a;

        public q(GearRoute.m mVar) {
            this.f35561a = mVar;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            GearRoute.m mVar = this.f35561a;
            return ParametersHolderKt.parametersOf(mVar.f35658a, mVar.f35659b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$q0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class q0 extends lc.q0<c80.u> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35562s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(n63.b bVar) {
            super(true);
            this.f35562s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        public final c80.u a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35562s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final c80.u h(String str) {
            str.getClass();
            n63.b bVar = this.f35562s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, c80.u uVar) {
            str.getClass();
            n63.b bVar = this.f35562s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(c80.u.INSTANCE.serializer()), uVar));
        }

        @Override // lc.q0
        public final String f(c80.u uVar) {
            n63.b bVar = this.f35562s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(c80.u.INSTANCE.serializer()), uVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$3$1$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<qk0.d> f35563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rk0.k f35564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(x3<qk0.d> x3Var, rk0.k kVar, lc.v vVar, t13.d<? super r> dVar) {
            super(2, dVar);
            this.f35563a = x3Var;
            this.f35564b = kVar;
            this.f35565c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new r(this.f35563a, this.f35564b, this.f35565c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            qk0.d f182175a = this.f35563a.getF182175a();
            if (f182175a != null) {
                rk0.k kVar = this.f35564b;
                kVar.getClass();
                jk0.j jVar = ((rk0.j) kVar.f153180g.getValue()).f153165a;
                if (jVar != null) {
                    List<x0> list = f182175a.f145086a;
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new jk0.g(((x0) it.next()).f4358a, Boolean.TRUE, (Boolean) null, 4, (p005kotlin.jvm.internal.j) null));
                    }
                    kVar.b3(jk0.j.a(jVar, null, null, arrayList, 383), f182175a.f145087b);
                }
                this.f35565c.a().f(null, "MultiActivitySelectionScreen_Selected");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$r0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class r0 extends lc.q0<List<? extends String>> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35566s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(n63.b bVar) {
            super(true);
            this.f35566s = bVar;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // lc.q0
        public final List<? extends String> a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35566s;
            bVar.getClass();
            return bVar.c(new m63.e(y1.f117048a), strI);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final List<? extends String> h(String str) {
            str.getClass();
            n63.b bVar = this.f35566s;
            bVar.getClass();
            return bVar.c(new m63.e(y1.f117048a), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, List<? extends String> list) {
            str.getClass();
            n63.b bVar = this.f35566s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(new m63.e(y1.f117048a)), list));
        }

        @Override // lc.q0
        public final String f(List<? extends String> list) {
            n63.b bVar = this.f35566s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(new m63.e(y1.f117048a)), list);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$3$2$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<ArrayList<uk0.a>> f35567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rk0.k f35568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lc.v f35569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(x3<? extends ArrayList<uk0.a>> x3Var, rk0.k kVar, lc.v vVar, t13.d<? super s> dVar) {
            super(2, dVar);
            this.f35567a = x3Var;
            this.f35568b = kVar;
            this.f35569c = vVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new s(this.f35567a, this.f35568b, this.f35569c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            ArrayList<uk0.a> f182175a = this.f35567a.getF182175a();
            if (f182175a != null) {
                this.f35568b.e4(f182175a);
                this.f35569c.a().f(null, "ManageCollectionGearScreen_SelectedGear");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$s0", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class s0 extends lc.q0<c80.u> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35570s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(n63.b bVar) {
            super(true);
            this.f35570s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        public final c80.u a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35570s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [c80.u, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final c80.u h(String str) {
            str.getClass();
            n63.b bVar = this.f35570s;
            bVar.getClass();
            return bVar.c(c80.u.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, c80.u uVar) {
            str.getClass();
            n63.b bVar = this.f35570s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(c80.u.INSTANCE.serializer()), uVar));
        }

        @Override // lc.q0
        public final String f(c80.u uVar) {
            n63.b bVar = this.f35570s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(c80.u.INSTANCE.serializer()), uVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$3$3$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc.v f35571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<rk0.o0> f35572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rk0.k f35573c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f35574d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(lc.v vVar, x3<rk0.o0> x3Var, rk0.k kVar, lc.m0 m0Var, t13.d<? super t> dVar) {
            super(2, dVar);
            this.f35571a = vVar;
            this.f35572b = x3Var;
            this.f35573c = kVar;
            this.f35574d = m0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new t(this.f35571a, this.f35572b, this.f35573c, this.f35574d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            j1 j1VarA;
            Object value;
            rk0.j jVar;
            jk0.j jVarA;
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            rk0.o0 f182175a = this.f35572b.getF182175a();
            if (f182175a != null) {
                if (!f182175a.f() && !f182175a.d()) {
                    f182175a = null;
                }
                if (f182175a != null) {
                    rk0.k kVar = this.f35573c;
                    kVar.getClass();
                    if (f182175a.d()) {
                        p2 p2Var = kVar.f153180g;
                        do {
                            value = p2Var.getValue();
                            jVar = (rk0.j) value;
                            jk0.j jVar2 = jVar.f153165a;
                            if (jVar2 != null) {
                                List<jk0.s> list = jVar2.f99268g;
                                if (list != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj2 : list) {
                                        if (!p005kotlin.jvm.internal.s.g(((jk0.s) obj2).f99322a, f182175a.f153238a)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                jVarA = jk0.j.a(jVar2, null, arrayList, null, 447);
                            } else {
                                jVarA = null;
                            }
                        } while (!p2Var.b(value, rk0.j.a(jVar, jVarA, null, null, 22)));
                    } else if (f182175a.f() || f182175a.d()) {
                        kVar.x4();
                    }
                    lc.v vVarF = this.f35574d.f();
                    if (vVarF != null && (j1VarA = vVarF.a()) != null) {
                        j1VarA.f(Boolean.TRUE, "CollectionDetailsScreen_GearEdited");
                    }
                }
            }
            this.f35571a.a().f(null, "GearDetailsScreen_Edited");
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$3$4$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rk0.k f35575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(rk0.k kVar, lc.v vVar, x3<Boolean> x3Var, t13.d<? super u> dVar) {
            super(2, dVar);
            this.f35575a = kVar;
            this.f35576b = vVar;
            this.f35577c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new u(this.f35575a, this.f35576b, this.f35577c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35577c.getF182175a(), Boolean.TRUE)) {
                rk0.k kVar = this.f35575a;
                p2 p2Var = kVar.f153180g;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, rk0.j.a((rk0.j) value, null, null, null, 23)));
                kVar.x4();
                this.f35576b.a().f(null, "EditCollectionScreen_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.GearActivity$onCreate$1$1$1$1$1$3$5$1", f = "GearActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rk0.k f35578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lc.v f35579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f35580c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(rk0.k kVar, lc.v vVar, x3<Boolean> x3Var, t13.d<? super v> dVar) {
            super(2, dVar);
            this.f35578a = kVar;
            this.f35579b = vVar;
            this.f35580c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new v(this.f35578a, this.f35579b, this.f35580c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a aVar2 = GearActivity.f35500b;
            if (p005kotlin.jvm.internal.s.g(this.f35580c.getF182175a(), Boolean.TRUE)) {
                this.f35578a.x4();
                this.f35579b.a().f(null, "ManagePhotos_Edited");
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class w extends p005kotlin.jvm.internal.q implements e23.a<Unit> {
        public w(Object obj) {
            super(0, obj, b.u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((b.u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class x implements e23.l<lc.k0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hf.j f35583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f35585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a f35586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k23.d f35587g;

        public x(int i14, String str, hf.j jVar, e23.a aVar, lc.m0 m0Var, e23.a aVar2, k23.d dVar) {
            this.f35581a = i14;
            this.f35582b = str;
            this.f35583c = jVar;
            this.f35584d = aVar;
            this.f35585e = m0Var;
            this.f35586f = aVar2;
            this.f35587g = dVar;
        }

        @Override // e23.l
        public final Unit invoke(lc.k0 k0Var) {
            lc.k0 k0Var2 = k0Var;
            k0Var2.getClass();
            z3.e eVar = new z3.e(96046079, true, new com.garmin.android.apps.connectmobile.gear.presentation.c(this.f35581a, this.f35582b, this.f35583c, this.f35584d, this.f35585e, this.f35586f, this.f35587g));
            p13.k0 k0Var3 = p13.k0.f134949a;
            k0Var3.getClass();
            p13.j0 j0Var = p13.j0.f134944a;
            t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            nc.n.a(k0Var2, t0Var.b(y22.k.class), k0Var3, j0Var, null, null, null, null, eVar);
            nc.n.a(k0Var2, t0Var.b(y22.l.class), k0Var3, j0Var, null, null, null, null, new z3.e(-1678331096, true, new com.garmin.android.apps.connectmobile.gear.presentation.e(this.f35583c, this.f35584d, this.f35586f, this.f35585e, this.f35587g)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class y implements e23.l<lc.k0, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f35589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ hf.j f35590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lc.m0 f35592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a f35593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k23.d f35594g;

        public y(int i14, String str, hf.j jVar, e23.a aVar, lc.m0 m0Var, e23.a aVar2, k23.d dVar) {
            this.f35588a = i14;
            this.f35589b = str;
            this.f35590c = jVar;
            this.f35591d = aVar;
            this.f35592e = m0Var;
            this.f35593f = aVar2;
            this.f35594g = dVar;
        }

        @Override // e23.l
        public final Unit invoke(lc.k0 k0Var) {
            lc.k0 k0Var2 = k0Var;
            k0Var2.getClass();
            z3.e eVar = new z3.e(96046079, true, new com.garmin.android.apps.connectmobile.gear.presentation.h(this.f35588a, this.f35589b, this.f35590c, this.f35591d, this.f35592e, this.f35593f, this.f35594g));
            p13.k0 k0Var3 = p13.k0.f134949a;
            k0Var3.getClass();
            p13.j0 j0Var = p13.j0.f134944a;
            t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            nc.n.a(k0Var2, t0Var.b(y22.k.class), k0Var3, j0Var, null, null, null, null, eVar);
            nc.n.a(k0Var2, t0Var.b(y22.l.class), k0Var3, j0Var, null, null, null, null, new z3.e(-1678331096, true, new com.garmin.android.apps.connectmobile.gear.presentation.j(this.f35590c, this.f35591d, this.f35593f, this.f35592e, this.f35594g)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/GearActivity$z", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class z extends lc.q0<b63.o> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n63.b f35595s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(n63.b bVar) {
            super(true);
            this.f35595s = bVar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [b63.o, java.lang.Object] */
        @Override // lc.q0
        public final b63.o a(Bundle bundle, String str) {
            String strI = q2.i(str, str, bundle);
            if (strI == null) {
                return null;
            }
            n63.b bVar = this.f35595s;
            bVar.getClass();
            return bVar.c(b63.o.INSTANCE.serializer(), strI);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [b63.o, java.lang.Object] */
        @Override // lc.q0
        /* JADX INFO: renamed from: d */
        public final b63.o h(String str) {
            str.getClass();
            n63.b bVar = this.f35595s;
            bVar.getClass();
            return bVar.c(b63.o.INSTANCE.serializer(), str);
        }

        @Override // lc.q0
        public final void e(Bundle bundle, String str, b63.o oVar) {
            str.getClass();
            n63.b bVar = this.f35595s;
            bVar.getClass();
            bundle.putString(str, bVar.b(j63.a.d(b63.o.INSTANCE.serializer()), oVar));
        }

        @Override // lc.q0
        public final String f(b63.o oVar) {
            n63.b bVar = this.f35595s;
            bVar.getClass();
            return q2.j(bVar, j63.a.d(b63.o.INSTANCE.serializer()), oVar);
        }
    }

    public static pk0.o da(lc.m0 m0Var, p3.m mVar) {
        pk0.o mVar2;
        mVar.C(-836479581);
        x1 x1Var = p3.n.f135158a;
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        lc.v vVarFa = fa(m0Var, t0Var.b(GearRoute.b.class), false);
        if (vVarFa == null) {
            vVarFa = fa(m0Var, t0Var.b(GearRoute.f.class), false);
        }
        if (vVarFa == null) {
            mVar.C(-162629854);
            mVar.f();
            lc.v vVarFa2 = fa(m0Var, t0Var.b(GearRoute.h.class), false);
            if (vVarFa2 == null) {
                mVar.C(-162448287);
                mVar.f();
                a2 a2Var = a2.GEAR;
                i2.f36769a.getClass();
                i2.a.p(a2Var, "GearActivity", "Couldn't find brand/model selection view model. Falling back to manual selection.");
                mVar2 = new nk0.m();
            } else {
                mVar.C(-162448286);
                mVar.L(-1614864554);
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(t0Var.b(sk0.q0.class), vVarFa2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVarFa2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
                mVar.R();
                mVar2 = (sk0.q0) u1VarResolveViewModel;
                mVar.f();
            }
        } else {
            mVar.C(-162629853);
            mVar.L(-1614864554);
            u1 u1VarResolveViewModel2 = GetViewModelKt.resolveViewModel(t0Var.b(sk0.r.class), vVarFa.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVarFa), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
            mVar.R();
            mVar2 = (sk0.r) u1VarResolveViewModel2;
            mVar.f();
        }
        mVar.f();
        return mVar2;
    }

    public static lc.v fa(lc.m0 m0Var, k23.d dVar, boolean z14) {
        try {
            return m0Var.c(dVar);
        } catch (Exception e4) {
            if (!z14) {
                return null;
            }
            a2 a2Var = a2.GEAR;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Attempted to get invalid back stack entry: ");
            i2.f36769a.getClass();
            i2.a.p(a2Var, "GearActivity", strD);
            return null;
        }
    }

    public final void ea(String str, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-688002078);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b(str, null);
                o0VarE.K(objQ);
            }
            p3.l0.e((e23.p) objQ, unit, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw0.i(this, str, i14, 6);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b.j.a(this);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("StartDestinationKey") : null;
            parcelable = (GearRoute) (parcelableExtra instanceof GearRoute ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("StartDestinationKey", GearRoute.class);
        }
        GearRoute gearRoute = (GearRoute) parcelable;
        if (gearRoute != null) {
            initComposeScreen(new z3.e(-402470803, true, new nk0.i(this, gearRoute, 0)));
        } else {
            vb.h.z("Missing gear start destination.");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/GearActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LIST_DEEP_LINK_URL", "START_DESTINATION_KEY", "GEAR_CREATED_RESULT_KEY", "COLLECTION_CREATED_KEY", "MANAGE_COLLECTION_GEAR_CREATED_KEY", "MANAGE_COLLECTION_SELECTED_GEAR_KEY", "ACTIVITY_TYPES_SELECTED_KEY", "BRAND_MODEL_SELECTION_RESULT_KEY", "GEAR_EDITED_RESULT_KEY", "COLLECTION_EDITED_RESULT_KEY", "GEAR_DETAILS_RESULT_KEY", "COLLECTION_DETAILS_EDITED_KEY", "COLLECTION_DETAILS_GEAR_EDITED_KEY", "MANAGE_PHOTOS_EDITED_KEY", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context) {
            Intent intentD = sn.a.d(context, context, GearActivity.class);
            intentD.putExtra("StartDestinationKey", GearRoute.j.INSTANCE);
            return intentD;
        }

        private a() {
        }
    }
}
