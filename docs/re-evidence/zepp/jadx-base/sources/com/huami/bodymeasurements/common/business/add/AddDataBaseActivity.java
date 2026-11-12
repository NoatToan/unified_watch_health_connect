package com.huami.bodymeasurements.common.business.add;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.R;
import com.huami.bodymeasurements.common.business.add.AddDataBaseActivity;
import com.huami.bodymeasurements.common.business.add.view.ItemView;
import com.huami.bodymeasurements.common.utils.GlobalTitleStyleKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.share.ShareAnalytics;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/AddDataBaseActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", GoogleApiAvailabilityLight.b, "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestSave", "", "Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "getItemViews", ShareAnalytics.ParamValue.SAVE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "x", "Ljava/util/ArrayList;", "itemViews", "<init>", "()V", "common_release"}, k = 1, mv = {1, 5, 1})
public class AddDataBaseActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<ItemView> itemViews = new ArrayList<>();

    private final void m() {
        this.itemViews.clear();
        this.itemViews.addAll(getItemViews());
        ((LinearLayout) findViewById(R.id.itemContainer)).removeAllViews();
        for (ItemView itemView : this.itemViews) {
            ((LinearLayout) findViewById(R.id.itemContainer)).addView(itemView, itemView.getLayoutParams());
        }
    }

    private final void n() {
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.bm_common_add_data), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(AddDataBaseActivity addDataBaseActivity, View view) {
        addDataBaseActivity.save();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public List<ItemView> getItemViews() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bm_common_activity_add_data_base);
        n();
        m();
        ((TypefaceTextView) findViewById(R.id.saveBtn)).setOnClickListener(new View.OnClickListener() { // from class: m7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddDataBaseActivity.o(this.a, view);
            }
        });
    }

    public final void requestSave() {
        ArrayList<ItemView> arrayList = this.itemViews;
        boolean z = true;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((ItemView) it2.next()).saveEnable()) {
                    z = false;
                    break;
                }
            }
        }
        ((TypefaceTextView) findViewById(R.id.saveBtn)).setEnabled(z);
    }

    public void save() {
    }
}
