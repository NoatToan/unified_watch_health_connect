package pr2;

import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import p005kotlin.Unit;
import pk0.m;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PasscodeEntryActivity f139638b;

    public /* synthetic */ a(PasscodeEntryActivity passcodeEntryActivity, int i14) {
        this.f139637a = i14;
        this.f139638b = passcodeEntryActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f139637a;
        PasscodeEntryActivity passcodeEntryActivity = this.f139638b;
        switch (i14) {
            case 0:
                PasscodeEntryActivity.a aVar = PasscodeEntryActivity.f52121n;
                return passcodeEntryActivity;
            case 1:
                PasscodeEntryActivity.a aVar2 = PasscodeEntryActivity.f52121n;
                br2.c.f19585a.a(new m(3), passcodeEntryActivity);
                return Unit.INSTANCE;
            case 2:
                PasscodeEntryActivity.a aVar3 = PasscodeEntryActivity.f52121n;
                passcodeEntryActivity.finish();
                return Unit.INSTANCE;
            default:
                PasscodeEntryActivity.a aVar4 = PasscodeEntryActivity.f52121n;
                passcodeEntryActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
