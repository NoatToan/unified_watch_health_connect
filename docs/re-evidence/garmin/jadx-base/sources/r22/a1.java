package r22;

import com.garmin.android.apps.connectmobile.view.LabelledValuesRangeProgressBar;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class a1 extends p005kotlin.jvm.internal.q implements e23.l<Integer, String> {
    public a1(Object obj) {
        super(1, obj, LabelledValuesRangeProgressBar.class, "formatProgressValue", "formatProgressValue(I)Ljava/lang/String;", 0);
    }

    @Override // e23.l
    public final String invoke(Integer num) {
        int iIntValue = num.intValue();
        LabelledValuesRangeProgressBar labelledValuesRangeProgressBar = (LabelledValuesRangeProgressBar) this.receiver;
        int i14 = LabelledValuesRangeProgressBar.f47474k;
        return labelledValuesRangeProgressBar.f47479e.invoke(Integer.valueOf(iIntValue));
    }
}
