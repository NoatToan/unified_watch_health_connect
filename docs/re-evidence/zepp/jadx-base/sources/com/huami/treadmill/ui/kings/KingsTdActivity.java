package com.huami.treadmill.ui.kings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.huami.tools.analytics.DbUtils;
import com.huami.treadmill.R;
import com.huami.treadmill.ui.kings.KingsTdActivity;
import com.huami.treadmill.ui.linedetail.FragmentsPageAdapter;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/treadmill/ui/kings/KingsTdActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "x", "J", "mLineId", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class KingsTdActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String LINE_ID = "line_id";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long mLineId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/treadmill/ui/kings/KingsTdActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "id", "", "startMe", "", "LINE_ID", "Ljava/lang/String;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, long id) {
            Intent intent = new Intent(context, (Class<?>) KingsTdActivity.class);
            intent.putExtra("line_id", id);
            context.startActivity(intent);
        }
    }

    private final void m() {
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(getString(R.string.td_successive_king), getString(R.string.td_success_rate_king));
        this.mLineId = getIntent().getLongExtra("line_id", 0L);
        CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setScrollPivotX(0.5f);
        commonNavigator.setAdjustMode(true);
        commonNavigator.setAdapter(new KingsTdActivity$initViewPager$1(this, listMutableListOf));
        int i = R.id.tab_layout;
        ((MagicIndicator) findViewById(i)).setNavigator(commonNavigator);
        MagicIndicator magicIndicator = (MagicIndicator) findViewById(i);
        int i2 = R.id.view_pager;
        ViewPagerHelper.bind(magicIndicator, (ViewPager) findViewById(i2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(DiligentKingsFragment.INSTANCE.newInstance(this.mLineId));
        arrayList.add(SpeedKingsFragment.INSTANCE.newInstance(this.mLineId));
        ((ViewPager) findViewById(i2)).setAdapter(new FragmentsPageAdapter(getSupportFragmentManager(), arrayList));
        ((ViewPager) findViewById(i2)).setOffscreenPageLimit(arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(KingsTdActivity kingsTdActivity, View view) {
        kingsTdActivity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kings_td);
        setStyle(BaseTitleActivity.STYLE.NONE, 0, true);
        ((ImageView) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() { // from class: dl4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KingsTdActivity.n(this.a, view);
            }
        });
        m();
    }
}
