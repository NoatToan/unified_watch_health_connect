package com.huami.sky.ui.intro.preference;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sky.ui.R;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\bD\u0010EJ\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00100\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%\"\u0004\b/\u0010'Ro\u0010>\u001aO\u0012\u0013\u0012\u00110!¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u001105¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u000b\u0018\u000101j\u0004\u0018\u0001`78\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010C\u001a\u00020\u00058\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006G"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SelectedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "onMyCreateViewHolder", "holder", "position", "", "onBindViewHolder", "Lcom/huami/sky/ui/intro/preference/SelectedViewHolder;", "onSelectBindViewHolder", "getItemCount", "", "Lcom/huami/sky/ui/intro/preference/SelectEntity;", "itemDataLists", "updateDataSource", "getItemViewType", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Ljava/util/List;", "getDataLists", "()Ljava/util/List;", "dataLists", "", "c", "Ljava/lang/String;", "getQuestionName", "()Ljava/lang/String;", "setQuestionName", "(Ljava/lang/String;)V", "questionName", GoogleApiAvailabilityLight.a, "getQuestionSubTitle", "setQuestionSubTitle", "questionSubTitle", "e", "getQuestionTag", "setQuestionTag", "questionTag", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "", "isSelected", "Lcom/huami/sky/ui/intro/preference/ItemClickListener;", "f", "Lkotlin/jvm/functions/Function3;", "getItemClick", "()Lkotlin/jvm/functions/Function3;", "setItemClick", "(Lkotlin/jvm/functions/Function3;)V", "itemClick", "g", LogUtil.I, "getHeadCount", "()I", "headCount", "<init>", "(Landroid/content/Context;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class SelectedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int ITEM_TYPE_CONTENT = 1;
    public static final int ITEM_TYPE_HEAD = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function3<? super String, ? super Integer, ? super Boolean, Unit> itemClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<SelectEntity> dataLists = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private String questionName = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String questionSubTitle = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String questionTag = WebConstant.QueryParam.TYPE_MUSIC;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int headCount = 1;

    public SelectedAdapter(@NotNull Context context) {
        this.context = context;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<SelectEntity> getDataLists() {
        return this.dataLists;
    }

    public final int getHeadCount() {
        return this.headCount;
    }

    @Nullable
    public final Function3<String, Integer, Boolean, Unit> getItemClick() {
        return this.itemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.dataLists.size() + this.headCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position == 0 ? 0 : 1;
    }

    @NotNull
    public final String getQuestionName() {
        return this.questionName;
    }

    @NotNull
    public final String getQuestionSubTitle() {
        return this.questionSubTitle;
    }

    @NotNull
    public final String getQuestionTag() {
        return this.questionTag;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bind(this.questionName, this.questionSubTitle);
        } else if (holder instanceof SelectedViewHolder) {
            onSelectBindViewHolder((SelectedViewHolder) holder, position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return viewType == 0 ? new HeaderViewHolder(LayoutInflater.from(this.context).inflate(R.layout.sky_preference_head, parent, false)) : onMyCreateViewHolder(parent, viewType);
    }

    @NotNull
    public abstract RecyclerView.ViewHolder onMyCreateViewHolder(@NotNull ViewGroup parent, int viewType);

    public void onSelectBindViewHolder(@NotNull SelectedViewHolder holder, int position) {
    }

    public final void setItemClick(@Nullable Function3<? super String, ? super Integer, ? super Boolean, Unit> function3) {
        this.itemClick = function3;
    }

    public final void setQuestionName(@NotNull String str) {
        this.questionName = str;
    }

    public final void setQuestionSubTitle(@NotNull String str) {
        this.questionSubTitle = str;
    }

    public final void setQuestionTag(@NotNull String str) {
        this.questionTag = str;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updateDataSource(@NotNull List<SelectEntity> itemDataLists) {
        this.dataLists.clear();
        this.dataLists.addAll(itemDataLists);
        notifyDataSetChanged();
    }
}
