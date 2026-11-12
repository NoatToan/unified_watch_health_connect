package yv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.selectionitem.SelectionItemDataHandler$Companion", f = "SelectionItemDataHandler.kt", l = {30}, m = "updateSelectionItem", v = 1)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f199859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f199860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a f199861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f199861c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199860b = obj;
        this.f199862d |= Integer.MIN_VALUE;
        return this.f199861c.a(null, 0, 0, 0, this);
    }
}
