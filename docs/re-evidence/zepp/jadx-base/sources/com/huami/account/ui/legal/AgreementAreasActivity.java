package com.huami.account.ui.legal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.content.ContextCompat;
import com.huami.account.LocalAgreement;
import com.huami.account.UserLegalInfoFallbackKt;
import com.huami.account.WebHelper;
import com.huami.account.bean.LegalInfoType;
import com.huami.account.ui.R;
import com.huami.account.ui.legal.AgreementAreasActivity;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/huami/account/ui/legal/AgreementAreasActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/account/bean/LegalInfoType;", "m", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class AgreementAreasActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String x = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/account/ui/legal/AgreementAreasActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/account/bean/LegalInfoType;", "agreementType", "", "start", "", "EXTRA_AGREEMENT_TYPE", "Ljava/lang/String;", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull LegalInfoType agreementType) {
            Intent intent = new Intent(context, (Class<?>) AgreementAreasActivity.class);
            intent.addFlags(268435456);
            intent.putExtra("type", agreementType);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegalInfoType.values().length];
            iArr[LegalInfoType.AGREEMENT.ordinal()] = 1;
            iArr[LegalInfoType.EXPERIENCE.ordinal()] = 2;
            iArr[LegalInfoType.PRIVACY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final LegalInfoType m() {
        Serializable serializableExtra = getIntent().getSerializableExtra("type");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.huami.account.bean.LegalInfoType");
        return (LegalInfoType) serializableExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(List list, AdapterView adapterView, View view, int i, long j) {
        LocalAgreement localAgreement = (LocalAgreement) CollectionsKt.getOrNull(list, i);
        String target = localAgreement == null ? null : localAgreement.getTarget();
        if (target == null) {
            return;
        }
        WebHelper.launch(target);
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull LegalInfoType legalInfoType) {
        INSTANCE.start(context, legalInfoType);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_activity_agreement_areas);
        LegalInfoType legalInfoTypeM = m();
        int i = WhenMappings.$EnumSwitchMapping$0[legalInfoTypeM.ordinal()];
        if (i == 1) {
            string = getString(R.string.account_ui_user_agreement);
        } else if (i == 2) {
            string = getString(R.string.account_ui_user_plan);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            string = getString(R.string.account_ui_user_privacy);
        }
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s10), string, true ^ RainbowUtils.isDarkMode(this));
        final List<LocalAgreement> localAgreementList = UserLegalInfoFallbackKt.getLocalAgreementList(legalInfoTypeM);
        ListView listView = (ListView) findViewById(R.id.lv_agreement_areas);
        int i2 = R.layout.account_ui_item_agreement_area;
        int i3 = R.id.item_area;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localAgreementList, 10));
        Iterator<T> it2 = localAgreementList.iterator();
        while (it2.hasNext()) {
            arrayList.add(((LocalAgreement) it2.next()).getName());
        }
        listView.setAdapter((ListAdapter) new ArrayAdapter(this, i2, i3, arrayList));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: ma
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
                AgreementAreasActivity.n(localAgreementList, adapterView, view, i4, j);
            }
        });
    }
}
