package gl1;

import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import org.koin.core.parameter.ParametersHolderKt;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f77852b;

    public /* synthetic */ m(int i14, Long l14) {
        this.f77851a = i14;
        this.f77852b = l14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f77851a;
        Long l14 = this.f77852b;
        switch (i14) {
            case 0:
                break;
            case 1:
                Logger logger = in2.d.f94559c;
                break;
            default:
                PersonalRecordsActivity.a aVar = PersonalRecordsActivity.f40337b;
                break;
        }
        return ParametersHolderKt.parametersOf(l14);
    }
}
