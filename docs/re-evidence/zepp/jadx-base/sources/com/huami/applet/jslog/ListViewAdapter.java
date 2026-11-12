package com.huami.applet.jslog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.huami.applet.R;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J$\u0010\r\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017R\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/applet/jslog/ListViewAdapter;", "Landroid/widget/BaseAdapter;", "", "getCount", "position", "", "getItem", "", "getItemId", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "b", "Ljava/util/List;", "itemList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class ListViewAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<String> itemList;

    public ListViewAdapter(@NotNull Context context, @NotNull List<String> list) {
        this.context = context;
        this.itemList = list;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.itemList.size();
    }

    @Override // android.widget.Adapter
    @NotNull
    public Object getItem(int position) {
        return this.itemList.get(position);
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return this.itemList.get(position).hashCode();
    }

    @Override // android.widget.Adapter
    @SuppressLint({"InflateParams"})
    @NotNull
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        b bVar;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(R.layout.applet_item_js_log_line_view, (ViewGroup) null);
            bVar = new b();
            bVar.d((TextView) convertView.findViewById(R.id.applet_js_log_line_log));
            bVar.c((TextView) convertView.findViewById(R.id.applet_js_log_line_num));
            convertView.setTag(bVar);
        } else {
            Object tag = convertView.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.huami.applet.jslog.LogViewHolder");
            bVar = (b) tag;
        }
        bVar.b().setText(this.itemList.get(position));
        bVar.a().setText(String.valueOf(position));
        return convertView;
    }
}
