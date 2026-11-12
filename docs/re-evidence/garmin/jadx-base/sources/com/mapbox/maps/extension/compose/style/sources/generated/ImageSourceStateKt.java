package com.mapbox.maps.extension.compose.style.sources.generated;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.extension.compose.style.IdGenerator;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0014\b\u0006\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"", Action.KEY_ATTRIBUTE, "sourceId", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;", "", "init", "rememberImageSourceState", "(Ljava/lang/String;Ljava/lang/String;Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/sources/generated/ImageSourceState;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageSourceStateKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.generated.ImageSourceStateKt$rememberImageSourceState$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass3 extends w implements a<ImageSourceState> {
        final /* synthetic */ l<ImageSourceState, Unit> $init;
        final /* synthetic */ String $sourceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, l<? super ImageSourceState, Unit> lVar) {
            super(0);
            this.$sourceId = str;
            this.$init = lVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // e23.a
        public final ImageSourceState invoke() {
            ImageSourceState imageSourceState = new ImageSourceState(this.$sourceId);
            this.$init.invoke(imageSourceState);
            return imageSourceState;
        }
    }

    public static final ImageSourceState rememberImageSourceState(String str, String str2, l<? super ImageSourceState, Unit> lVar, m mVar, int i14, int i15) {
        mVar.L(400442145);
        if ((i15 & 1) != 0) {
            str = null;
        }
        String str3 = str;
        if ((i15 & 2) != 0) {
            mVar.L(-492369756);
            Object objQ = mVar.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = IdGenerator.INSTANCE.generateRandomSourceId("image");
                mVar.K(objQ);
            }
            mVar.R();
            str2 = (String) objQ;
        }
        if ((i15 & 4) != 0) {
            lVar = AnonymousClass2.INSTANCE;
        }
        ImageSourceState imageSourceState = (ImageSourceState) d4.a.d(new Object[0], ImageSourceState.INSTANCE.getSaver(), str3, new AnonymousClass3(str2, lVar), mVar, ((i14 << 6) & 896) | 72, 0);
        mVar.R();
        return imageSourceState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.sources.generated.ImageSourceStateKt$rememberImageSourceState$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass2 extends w implements l<ImageSourceState, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(ImageSourceState imageSourceState) {
            invoke2(imageSourceState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ImageSourceState imageSourceState) {
            imageSourceState.getClass();
        }
    }
}
