package bb1;

import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.l;
import h82.r;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f17313c;

    public /* synthetic */ d(String str, l lVar) {
        this.f17311a = 0;
        this.f17313c = str;
        this.f17312b = lVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f17311a;
        String str = this.f17313c;
        l lVar = this.f17312b;
        switch (i14) {
            case 0:
                if (str != null && lVar != null) {
                    lVar.invoke(str);
                }
                return Unit.INSTANCE;
            case 1:
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 2:
                r rVar = r.f82497a;
                lVar.invoke(str);
                return Boolean.TRUE;
            case 3:
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 4:
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 5:
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 6:
                lVar.invoke(str);
                return Unit.INSTANCE;
            case 7:
                lVar.invoke(str);
                return Unit.INSTANCE;
            default:
                StrideLengthSettingsActivity.a aVar = StrideLengthSettingsActivity.f44198b;
                lVar.invoke(str);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(l lVar, String str, int i14) {
        this.f17311a = i14;
        this.f17312b = lVar;
        this.f17313c = str;
    }
}
