package ou;

import android.view.View;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsConfigActivity;
import java.util.ArrayList;
import java.util.List;
import k32.l;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioPromptsConfigActivity f133950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f133951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f133952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133953e;

    public /* synthetic */ b(AudioPromptsConfigActivity audioPromptsConfigActivity, ArrayList arrayList, List list, int i14, int i15) {
        this.f133949a = i15;
        this.f133950b = audioPromptsConfigActivity;
        this.f133951c = arrayList;
        this.f133952d = list;
        this.f133953e = i14;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f133949a) {
            case 0:
                ArrayList arrayList = this.f133951c;
                AudioPromptsConfigActivity.ca(arrayList);
                gu.b bVar = (gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null);
                List list = this.f133952d;
                int i14 = this.f133953e;
                bVar.j(this.f133950b.f30257d, ((lu.e) list.get(i14)).name(), lu.a.POWER);
                ((l) arrayList.get(i14)).c(2131232298, null, null, null);
                break;
            case 1:
                ArrayList arrayList2 = this.f133951c;
                AudioPromptsConfigActivity.ca(arrayList2);
                List list2 = this.f133952d;
                int i15 = this.f133953e;
                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).j(this.f133950b.f30257d, ((lu.c) list2.get(i15)).name(), lu.a.HEART_RATE);
                ((l) arrayList2.get(i15)).c(2131232298, null, null, null);
                break;
            default:
                ArrayList arrayList3 = this.f133951c;
                AudioPromptsConfigActivity.ca(arrayList3);
                List list3 = this.f133952d;
                int i16 = this.f133953e;
                ((gu.b) KoinJavaComponent.get$default(gu.b.class, null, null, 6, null)).j(this.f133950b.f30257d, ((lu.d) list3.get(i16)).name(), lu.a.PACE_SPEED);
                ((l) arrayList3.get(i16)).c(2131232298, null, null, null);
                break;
        }
    }
}
