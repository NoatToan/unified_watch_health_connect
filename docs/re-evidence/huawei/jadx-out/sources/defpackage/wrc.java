package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.userprofile.activity.interfaces.PersonalCenterUiApi;
import com.huawei.ui.main.stories.userprofile.card.PersonalGridCardViewHolder;

/* JADX INFO: loaded from: classes19.dex */
public class wrc extends AbstractBaseCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected wre f52359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f52360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f52361c;
    protected boolean d;
    protected PersonalCenterUiApi e;
    protected PersonalGridCardViewHolder j;

    protected void a() {
    }

    public wrc(Context context, PersonalCenterUiApi personalCenterUiApi) {
        this.f52360b = context;
        this.e = personalCenterUiApi;
        this.d = LoginInit.getInstance(context).isBrowseMode();
        a();
    }

    public void d(boolean z) {
        LogUtil.a("PersonalBaseCardData", "setIsVerticalLayout isVerticalLayout = ", Boolean.valueOf(z));
        this.f52361c = z;
        PersonalGridCardViewHolder personalGridCardViewHolder = this.j;
        if (personalGridCardViewHolder != null) {
            personalGridCardViewHolder.b(z);
        }
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        PersonalGridCardViewHolder personalGridCardViewHolder = new PersonalGridCardViewHolder(layoutInflater.inflate(R.layout.personal_grid_item_view, viewGroup, false), this.f52360b, this.f52359a);
        this.j = personalGridCardViewHolder;
        personalGridCardViewHolder.b(this.f52361c);
        return this.j;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "PersonalBaseCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        d();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        super.onResume();
        d();
    }

    protected void d() {
        LogUtil.a("PersonalBaseCardData", "initData  mIsBrowseMode = ", Boolean.valueOf(this.d));
        this.d = LoginInit.getInstance(this.f52360b).isBrowseMode();
    }

    protected void b(boolean z, int i) {
        if (this.f52359a.n() == z) {
            return;
        }
        if (z) {
            this.e.setBottomRedDotVisibility(i);
        } else {
            this.e.cancelBottomRedDotVisible(i);
        }
        this.f52359a.c(z);
        PersonalGridCardViewHolder personalGridCardViewHolder = this.j;
        if (personalGridCardViewHolder != null) {
            personalGridCardViewHolder.a(z);
        }
    }
}
