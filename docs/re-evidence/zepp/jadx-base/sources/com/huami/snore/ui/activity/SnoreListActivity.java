package com.huami.snore.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.huami.snore.core.R;
import com.huami.snore.ui.ext.ViewExtKt;
import com.huami.snore.ui.fragment.SnoreListFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\r"}, d2 = {"Lcom/huami/snore/ui/activity/SnoreListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroidx/fragment/app/Fragment;", "fragment", "", "m", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "<init>", "()V", "Companion", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class SnoreListActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/snore/ui/activity/SnoreListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/util/Date;", "dayTime", "", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void navigation(@Nullable Context context, @NotNull Date dayTime) {
            if (context == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) SnoreListActivity.class);
            intent.putExtra(SnoreListFragment.DAY_TIME_DATE_KEY, dayTime);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    private final void l() {
        getWindow().setBackgroundDrawable(null);
        ((FrameLayout) findViewById(R.id.common_title_content_parent)).setBackgroundColor(0);
    }

    private final void m(Fragment fragment) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.content, fragment);
        fragmentTransactionBeginTransaction.commit();
    }

    @JvmStatic
    public static final void navigation(@Nullable Context context, @NotNull Date date) {
        INSTANCE.navigation(context, date);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snore_list_layout);
        ViewExtKt.setUnifyTitleStyle$default(this, getString(R.string.snore_list_title), null, null, 6, null);
        SnoreListFragment.Companion companion = SnoreListFragment.INSTANCE;
        Serializable serializableExtra = getIntent().getSerializableExtra(SnoreListFragment.DAY_TIME_DATE_KEY);
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type java.util.Date");
        m(companion.newInstance((Date) serializableExtra));
    }
}
