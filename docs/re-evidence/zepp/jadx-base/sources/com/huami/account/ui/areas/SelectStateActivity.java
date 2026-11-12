package com.huami.account.ui.areas;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.AccountExternalContainer;
import com.huami.account.selectArea.baseui.IndexBar;
import com.huami.account.selectArea.datasource.StateMapper;
import com.huami.account.selectArea.entity.StateIndexBean;
import com.huami.account.service.model.Area;
import com.huami.account.service.model.SubArea;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectStateActivity;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0003!\"#B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R%\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/huami/account/ui/areas/SelectStateActivity;", "Lcom/huami/account/ui/common/BaseTitleOauthActivity;", "", "y", "w", "t", "", "Lcom/huami/account/service/model/SubArea;", "x", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/widget/ListView;", "kotlin.jvm.PlatformType", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lkotlin/Lazy;", "v", "()Landroid/widget/ListView;", "selectAreaListView", "Lcom/huami/account/selectArea/baseui/IndexBar;", "B", "u", "()Lcom/huami/account/selectArea/baseui/IndexBar;", "indexBar", "C", "Lcom/huami/account/service/model/SubArea;", "selectedState", "Lcom/huami/account/service/model/Area;", LogUtil.D, "Lcom/huami/account/service/model/Area;", "selectedArea", "<init>", "()V", "Companion", "a", "b", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class SelectStateActivity extends BaseTitleOauthActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String E = "SelectStateActivity";

    @NotNull
    private static final String F = "extraState";

    @NotNull
    private static final String G = "us_states.json";

    @NotNull
    private static final String H = "selectedArea";
    public static final int REQUEST_CODE = 113;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectAreaListView = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy indexBar = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private SubArea selectedState;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private Area selectedArea;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/account/ui/areas/SelectStateActivity$Companion;", "", "Landroid/app/Activity;", "activity", "Lcom/huami/account/service/model/Area;", "selectedArea", "", "requestCode", "", "start", "Landroid/content/Intent;", "data", "Lcom/huami/account/service/model/SubArea;", "parseState", "", "ASSET_US_STATES", "Ljava/lang/String;", "EXTRA_STATE", "REQUEST_CODE", LogUtil.I, "SELECTED_AREA", "TAG", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final SubArea parseState(@Nullable Intent data) {
            Serializable serializableExtra = data == null ? null : data.getSerializableExtra(SelectStateActivity.F);
            if (serializableExtra instanceof SubArea) {
                return (SubArea) serializableExtra;
            }
            return null;
        }

        @JvmStatic
        public final void start(@NotNull Activity activity, @Nullable Area selectedArea, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) SelectStateActivity.class);
            intent.putExtra("selectedArea", selectedArea);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\"\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"com/huami/account/ui/areas/SelectStateActivity$a", "Landroid/widget/BaseAdapter;", "", "getCount", "position", "Lcom/huami/account/selectArea/entity/StateIndexBean;", "b", "", "getItemId", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "", "a", "Ljava/util/List;", "states", "<init>", "(Lcom/huami/account/ui/areas/SelectStateActivity;Ljava/util/List;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<StateIndexBean> states;

        public a(List<StateIndexBean> list) {
            this.states = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, SelectStateActivity selectStateActivity, int i, View view) {
            aVar.notifyDataSetChanged();
            selectStateActivity.selectedState = aVar.states.get(i).getSubArea();
            selectStateActivity.y();
        }

        @Override // android.widget.Adapter
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public StateIndexBean getItem(int position) {
            return this.states.get(position);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.states.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // android.widget.Adapter
        @NotNull
        public View getView(final int position, @Nullable View convertView, @NotNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.account_ui_item_select_area, parent, false);
                convertView.setTag(new b(convertView));
            }
            Object tag = convertView.getTag();
            b bVar = tag instanceof b ? (b) tag : null;
            if (bVar == null) {
                return convertView;
            }
            StateIndexBean item = getItem(position);
            bVar.getNameText().setText(StateMapper.INSTANCE.exec(item.getSubArea().getValue()));
            ImageView checkbox = bVar.getCheckbox();
            SubArea subArea = SelectStateActivity.this.selectedState;
            checkbox.setVisibility(Intrinsics.areEqual(subArea != null ? subArea.getKey() : null, item.getSubArea().getKey()) ? 0 : 8);
            final SelectStateActivity selectStateActivity = SelectStateActivity.this;
            convertView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.account.ui.areas.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SelectStateActivity.a.c(this.a, selectStateActivity, position, view);
                }
            });
            return convertView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0010"}, d2 = {"com/huami/account/ui/areas/SelectStateActivity$b", "", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "nameText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", "checkbox", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "accountui_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final TextView nameText;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final ImageView checkbox;

        public b(@NotNull View view) {
            this.nameText = (TextView) view.findViewById(R.id.item_area);
            this.checkbox = (ImageView) view.findViewById(R.id.item_checked);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ImageView getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getNameText() {
            return this.nameText;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/account/selectArea/baseui/IndexBar;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<IndexBar> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndexBar getA() {
            return (IndexBar) SelectStateActivity.this.findViewById(R.id.indexBar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/ListView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ListView> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ListView getA() {
            return (ListView) SelectStateActivity.this.findViewById(R.id.select_area_list_view);
        }
    }

    @JvmStatic
    @Nullable
    public static final SubArea parseState(@Nullable Intent intent) {
        return INSTANCE.parseState(intent);
    }

    @JvmStatic
    public static final void start(@NotNull Activity activity, @Nullable Area area, int i) {
        INSTANCE.start(activity, area, i);
    }

    private final void t() {
        Intent intent = new Intent();
        intent.putExtra(F, this.selectedState);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndexBar u() {
        return (IndexBar) this.indexBar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListView v() {
        return (ListView) this.selectAreaListView.getValue();
    }

    private final void w() {
        final ArrayList arrayList = new ArrayList();
        for (SubArea subArea : x()) {
            StateIndexBean stateIndexBean = new StateIndexBean(subArea);
            stateIndexBean.setDataToSort(StateMapper.INSTANCE.exec(subArea.getValue()));
            arrayList.add(stateIndexBean);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            u().setSourceData(arrayList);
        }
        v().setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.huami.account.ui.areas.SelectStateActivity$initIndexBar$2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(@Nullable AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                this.a.u().setSelectIndex(arrayList.get(firstVisibleItem).getBaseIndexTag());
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(@Nullable AbsListView view, int scrollState) {
            }
        });
        u().setOnIndexChangeListener(new IndexBar.OnIndexChangeListener() { // from class: com.huami.account.ui.areas.SelectStateActivity$initIndexBar$3
            @Override // com.huami.account.selectArea.baseui.IndexBar.OnIndexChangeListener
            public void onChange(int position) {
                this.a.v().setSelection(position);
            }
        });
        v().setAdapter((ListAdapter) new a(arrayList));
    }

    private final List<SubArea> x() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(TextStreamsKt.readText(new InputStreamReader(AccountExternalContainer.INSTANCE.getAppContext().getAssets().open(G), Charsets.UTF_8))).optJSONArray("states");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    arrayList.add(new SubArea(jSONObject.optString("key"), jSONObject.optString("value"), jSONObject.optString("name")));
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (Exception e) {
            HMLog.e(E, "read us states failed: " + e.getMessage(), new Object[0]);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.account_ui_no_network_connection));
            return;
        }
        Area area = this.selectedArea;
        Objects.requireNonNull(area);
        if (Intrinsics.areEqual(area.getValue(), SelectAreaManager.getDefaultArea().getValue())) {
            t();
        } else {
            new AlertDialogFragment.Builder(this).setTitle(R.string.account_ui_select_area_diff_tip).setMessage(R.string.account_ui_select_area_diff_message).setNegativeButton(R.string.account_ui_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.account_ui_got_it, new DialogInterface.OnClickListener() { // from class: wm6
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SelectStateActivity.z(this.a, dialogInterface, i);
                }
            }).show(getSupportFragmentManager()).setGravity(17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SelectStateActivity selectStateActivity, DialogInterface dialogInterface, int i) {
        selectStateActivity.t();
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_ui_activity_select_area_layout);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s38), getString(R.string.account_ui_account_ccpa_select_state_title), !RainbowUtils.isDarkMode(this));
        setBaseTitleColor(ContextCompat.getColor(this, R.color.s1));
        w();
        Serializable serializableExtra = getIntent().getSerializableExtra("selectedArea");
        Objects.requireNonNull(serializableExtra, "null cannot be cast to non-null type com.huami.account.service.model.Area");
        Area area = (Area) serializableExtra;
        this.selectedArea = area;
        Objects.requireNonNull(area);
        this.selectedState = area.getSubArea();
    }
}
