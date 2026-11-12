package com.mapbox.maps.extension.compose;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import e23.l;
import e23.p;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.c;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\u000b\u001aG\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\r\u001aA\u0010\b\u001a\u00020\u00072\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u000e\"\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"", "key1", "Lkotlin/Function2;", "Lp3/i0;", "Lcom/mapbox/maps/MapView;", "Lp3/h0;", "block", "", "DisposableMapEffect", "(Ljava/lang/Object;Le23/p;Lp3/m;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Le23/p;Lp3/m;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Le23/p;Lp3/m;I)V", "", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;Le23/p;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DisposableMapEffectKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<i0, h0> {
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ MapView $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super i0, ? super MapView, ? extends h0> pVar, MapView mapView) {
            super(1);
            this.$block = pVar;
            this.$map = mapView;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            return this.$block.invoke(i0Var, this.$map);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<i0, h0> {
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ MapView $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super i0, ? super MapView, ? extends h0> pVar, MapView mapView) {
            super(1);
            this.$block = pVar;
            this.$map = mapView;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            return this.$block.invoke(i0Var, this.$map);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass5 extends w implements l<i0, h0> {
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ MapView $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(p<? super i0, ? super MapView, ? extends h0> pVar, MapView mapView) {
            super(1);
            this.$block = pVar;
            this.$map = mapView;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            return this.$block.invoke(i0Var, this.$map);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass7 extends w implements l<i0, h0> {
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ MapView $map;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(p<? super i0, ? super MapView, ? extends h0> pVar, MapView mapView) {
            super(1);
            this.$block = pVar;
            this.$map = mapView;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            return this.$block.invoke(i0Var, this.$map);
        }
    }

    @MapboxMapComposable
    public static final void DisposableMapEffect(Object[] objArr, p<? super i0, ? super MapView, ? extends h0> pVar, m mVar, int i14) {
        objArr.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(636409641);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.d(Arrays.copyOf(objArr, objArr.length), new AnonymousClass7(pVar, ((MapApplier) cVar).getMapView()), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass8(objArr, pVar, i14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ Object $key1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, p<? super i0, ? super MapView, ? extends h0> pVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$block = pVar;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            DisposableMapEffectKt.DisposableMapEffect(this.$key1, this.$block, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ Object $key1;
        final /* synthetic */ Object $key2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Object obj, Object obj2, p<? super i0, ? super MapView, ? extends h0> pVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$key2 = obj2;
            this.$block = pVar;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            DisposableMapEffectKt.DisposableMapEffect(this.$key1, this.$key2, this.$block, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ Object $key1;
        final /* synthetic */ Object $key2;
        final /* synthetic */ Object $key3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Object obj, Object obj2, Object obj3, p<? super i0, ? super MapView, ? extends h0> pVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$key2 = obj2;
            this.$key3 = obj3;
            this.$block = pVar;
            this.$$changed = i14;
        }

        public final void invoke(m mVar, int i14) {
            DisposableMapEffectKt.DisposableMapEffect(this.$key1, this.$key2, this.$key3, this.$block, mVar, this.$$changed | 1);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.DisposableMapEffectKt$DisposableMapEffect$8, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass8 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<i0, MapView, h0> $block;
        final /* synthetic */ Object[] $keys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Object[] objArr, p<? super i0, ? super MapView, ? extends h0> pVar, int i14) {
            super(2);
            this.$keys = objArr;
            this.$block = pVar;
            this.$$changed = i14;
        }

        public final void invoke(m mVar, int i14) {
            Object[] objArr = this.$keys;
            DisposableMapEffectKt.DisposableMapEffect(Arrays.copyOf(objArr, objArr.length), (p<? super i0, ? super MapView, ? extends h0>) this.$block, mVar, this.$$changed | 1);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @MapboxMapComposable
    public static final void DisposableMapEffect(Object obj, Object obj2, p<? super i0, ? super MapView, ? extends h0> pVar, m mVar, int i14) {
        pVar.getClass();
        o0 o0VarE = mVar.E(-334870122);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.b(obj, obj2, new AnonymousClass3(pVar, ((MapApplier) cVar).getMapView()), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(obj, obj2, pVar, i14);
    }

    @MapboxMapComposable
    public static final void DisposableMapEffect(Object obj, Object obj2, Object obj3, p<? super i0, ? super MapView, ? extends h0> pVar, m mVar, int i14) {
        pVar.getClass();
        o0 o0VarE = mVar.E(-1296710410);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.c(obj, obj2, obj3, new AnonymousClass5(pVar, ((MapApplier) cVar).getMapView()), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass6(obj, obj2, obj3, pVar, i14);
    }

    @MapboxMapComposable
    public static final void DisposableMapEffect(Object obj, p<? super i0, ? super MapView, ? extends h0> pVar, m mVar, int i14) {
        pVar.getClass();
        o0 o0VarE = mVar.E(1352277558);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.a(obj, new AnonymousClass1(pVar, ((MapApplier) cVar).getMapView()), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(obj, pVar, i14);
    }
}
