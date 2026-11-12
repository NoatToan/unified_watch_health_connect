package com.mapbox.maps.extension.compose.style.imports;

import ch.qos.logback.core.net.SyslogConstants;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u00020\u00012\u0014\b\u0006\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "", "init", "rememberStyleImportInteractionsState", "(Le23/l;Lp3/m;II)Lcom/mapbox/maps/extension/compose/style/imports/StyleImportInteractionsState;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StyleImportInteractionsStateKt {
    public static final StyleImportInteractionsState rememberStyleImportInteractionsState(l<? super StyleImportInteractionsState, Unit> lVar, m mVar, int i14, int i15) {
        mVar.L(-174642227);
        if ((i15 & 1) != 0) {
            lVar = AnonymousClass1.INSTANCE;
        }
        mVar.L(-492369756);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            objQ = new StyleImportInteractionsState();
            mVar.K(objQ);
        }
        mVar.R();
        lVar.invoke(objQ);
        StyleImportInteractionsState styleImportInteractionsState = (StyleImportInteractionsState) objQ;
        mVar.R();
        return styleImportInteractionsState;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.imports.StyleImportInteractionsStateKt$rememberStyleImportInteractionsState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends w implements l<StyleImportInteractionsState, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(StyleImportInteractionsState styleImportInteractionsState) {
            invoke2(styleImportInteractionsState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(StyleImportInteractionsState styleImportInteractionsState) {
            styleImportInteractionsState.getClass();
        }
    }
}
