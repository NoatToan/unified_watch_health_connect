package d52;

import com.mapbox.maps.extension.compose.style.standard.StandardStyleConfigurationState;
import iv0.y;
import l72.i3;
import lc.u0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f57587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f57588c;

    public /* synthetic */ m(e23.a aVar, e23.a aVar2, int i14) {
        this.f57586a = i14;
        this.f57587b = aVar;
        this.f57588c = aVar2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        e23.a aVar;
        switch (this.f57586a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str = i3Var.f111063a;
                if (p005kotlin.jvm.internal.s.g(str, "MENU_ITEM_HELP_PUSHES")) {
                    this.f57587b.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str, "MENU_ITEM_EDIT_PUSHES_GOAL")) {
                    this.f57588c.invoke();
                }
                return Unit.INSTANCE;
            case 1:
                qu0.f fVar = (qu0.f) obj;
                fVar.getClass();
                int i14 = y.d.f95205a[fVar.ordinal()];
                if (i14 == 1) {
                    this.f57587b.invoke();
                } else {
                    if (i14 != 2) {
                        u0.r();
                        return null;
                    }
                    this.f57588c.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                i3 i3Var2 = (i3) obj;
                i3Var2.getClass();
                String str2 = i3Var2.f111063a;
                if (p005kotlin.jvm.internal.s.g(str2, StandardStyleConfigurationState.CONFIG_THEME)) {
                    this.f57587b.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str2, "settings") && (aVar = this.f57588c) != null) {
                    aVar.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                i3 i3Var3 = (i3) obj;
                i3Var3.getClass();
                String str3 = i3Var3.f111063a;
                if (p005kotlin.jvm.internal.s.g(str3, "MENU_SEARCH")) {
                    this.f57587b.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str3, "MENU_EDIT_BEHAVIOURS")) {
                    this.f57588c.invoke();
                }
                return Unit.INSTANCE;
            case 4:
                i3 i3Var4 = (i3) obj;
                i3Var4.getClass();
                String str4 = i3Var4.f111063a;
                if (p005kotlin.jvm.internal.s.g(str4, "MENU_ITEM_HELP_STEPS")) {
                    this.f57587b.invoke();
                } else if (p005kotlin.jvm.internal.s.g(str4, "EDIT_STEPS_GOAL")) {
                    this.f57588c.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                f.a aVar2 = (f.a) obj;
                aVar2.getClass();
                if (aVar2.f67585a == -1) {
                    this.f57587b.invoke();
                } else {
                    this.f57588c.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                o2.h hVar = (o2.h) obj;
                this.f57587b.invoke();
                e23.a aVar3 = this.f57588c;
                if (aVar3 != null ? ((Boolean) aVar3.invoke()).booleanValue() : true) {
                    hVar.close();
                }
                return Unit.INSTANCE;
            default:
                o2.h hVar2 = (o2.h) obj;
                this.f57587b.invoke();
                e23.a aVar4 = this.f57588c;
                if (aVar4 != null ? ((Boolean) aVar4.invoke()).booleanValue() : true) {
                    hVar2.close();
                }
                return Unit.INSTANCE;
        }
    }
}
