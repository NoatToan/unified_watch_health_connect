package com.mapbox.maps.extension.compose.style;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.compose.style.layers.ImageValue;
import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function2;", "", "Lcom/mapbox/bindgen/Value;", "", "action", "Lp3/p1;", "Lcom/mapbox/maps/extension/compose/style/HoldsValue;", RemoteConfigConstants.ResponseFieldKey.STATE, "name", "ActionWhenNotInitial", "(Le23/p;Lp3/p1;Ljava/lang/String;Lp3/m;I)V", "Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;", "layerNode", "Lcom/mapbox/maps/extension/compose/style/layers/ImageValue;", "AddImageWhenNotInitial", "(Lcom/mapbox/maps/extension/compose/style/layers/internal/LayerNode;Lp3/p1;Ljava/lang/String;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PropertyTypesKt {
    public static final void ActionWhenNotInitial(p<? super String, ? super Value, Unit> pVar, p1<? extends HoldsValue> p1Var, String str, m mVar, int i14) {
        int i15;
        pVar.getClass();
        p1Var.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-176030388);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(p1Var) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i15 & 731) == 146 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            HoldsValue f182175a = p1Var.getF182175a();
            if (f182175a.isNotInitial()) {
                pVar.invoke(str, f182175a.getValue());
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(pVar, p1Var, str, i14);
    }

    public static final void AddImageWhenNotInitial(LayerNode layerNode, p1<ImageValue> p1Var, String str, m mVar, int i14) {
        int i15;
        layerNode.getClass();
        p1Var.getClass();
        str.getClass();
        o0 o0VarE = mVar.E(-297427953);
        if ((i14 & 14) == 0) {
            i15 = (o0VarE.B(layerNode) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            i15 |= o0VarE.B(p1Var) ? 32 : 16;
        }
        if ((i14 & 896) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i15 & 731) == 146 && o0VarE.b()) {
            o0VarE.e();
        } else {
            x1 x1Var = n.f135158a;
            ImageValue f182175a = p1Var.getF182175a();
            if (f182175a.getNotInitial$extension_compose_release()) {
                StyleImage styleImage = f182175a.getStyleImage();
                if (styleImage != null) {
                    layerNode.addImage$extension_compose_release(styleImage);
                }
                layerNode.setProperty$extension_compose_release(str, f182175a.getValue());
            }
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C41882(layerNode, p1Var, str, i14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.PropertyTypesKt$ActionWhenNotInitial$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p<String, Value, Unit> $action;
        final /* synthetic */ String $name;
        final /* synthetic */ p1<? extends HoldsValue> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super String, ? super Value, Unit> pVar, p1<? extends HoldsValue> p1Var, String str, int i14) {
            super(2);
            this.$action = pVar;
            this.$state = p1Var;
            this.$name = str;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PropertyTypesKt.ActionWhenNotInitial(this.$action, this.$state, this.$name, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.PropertyTypesKt$AddImageWhenNotInitial$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41882 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ LayerNode $layerNode;
        final /* synthetic */ String $name;
        final /* synthetic */ p1<ImageValue> $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41882(LayerNode layerNode, p1<ImageValue> p1Var, String str, int i14) {
            super(2);
            this.$layerNode = layerNode;
            this.$state = p1Var;
            this.$name = str;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            PropertyTypesKt.AddImageWhenNotInitial(this.$layerNode, this.$state, this.$name, mVar, this.$$changed | 1);
        }
    }
}
