package com.zhouyou.recyclerview.group;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.XRecyclerView;
import com.zhouyou.recyclerview.adapter.HelperRecyclerViewHolder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class GroupedRecyclerViewAdapter<T> extends RecyclerView.Adapter<HelperRecyclerViewHolder> {
    public static final int TYPE_CHILD = 50002;
    public static final int TYPE_FOOTER = 50001;
    public static final int TYPE_HEADER = 50000;
    private List<T> a;
    private OnHeaderClickListener b;
    private OnFooterClickListener c;
    private OnChildClickListener d;
    private boolean e;
    private int f;
    public Context mContext;
    public ArrayList<GroupStructure> mStructures = new ArrayList<>();
    public XRecyclerView xRecyclerView;

    public interface OnChildClickListener<T> {
        void onChildClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, HelperRecyclerViewHolder helperRecyclerViewHolder, int i, int i2, T t);
    }

    public interface OnFooterClickListener<T> {
        void onFooterClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t);
    }

    public interface OnHeaderClickListener<T> {
        void onHeaderClick(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t);
    }

    public class a extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ GridLayoutManager a;

        public a(GridLayoutManager gridLayoutManager) {
            this.a = gridLayoutManager;
        }

        public int a(int i) {
            int spanCount = this.a.getSpanCount();
            if (GroupedRecyclerViewAdapter.this.judgeType(i) != 50002) {
                return spanCount;
            }
            int groupPositionForPosition = GroupedRecyclerViewAdapter.this.getGroupPositionForPosition(i);
            return GroupedRecyclerViewAdapter.this.getChildSpanSize(groupPositionForPosition, GroupedRecyclerViewAdapter.this.getChildPositionForPosition(groupPositionForPosition, i));
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            XRecyclerView xRecyclerView = GroupedRecyclerViewAdapter.this.xRecyclerView;
            if (xRecyclerView == null) {
                return a(i);
            }
            return xRecyclerView.isHeaderFooter(i) ? this.a.getSpanCount() : a(i - (GroupedRecyclerViewAdapter.this.xRecyclerView.getHeadersCount() + 1));
        }
    }

    public class b implements View.OnClickListener {
        public final /* synthetic */ HelperRecyclerViewHolder a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public b(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, Object obj) {
            this.a = helperRecyclerViewHolder;
            this.b = i;
            this.c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.b != null) {
                GroupedRecyclerViewAdapter.this.b.onHeaderClick(GroupedRecyclerViewAdapter.this, this.a, this.b, this.c);
            }
        }
    }

    public class c implements View.OnClickListener {
        public final /* synthetic */ HelperRecyclerViewHolder a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public c(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, Object obj) {
            this.a = helperRecyclerViewHolder;
            this.b = i;
            this.c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.c != null) {
                GroupedRecyclerViewAdapter.this.c.onFooterClick(GroupedRecyclerViewAdapter.this, this.a, this.b, this.c);
            }
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ HelperRecyclerViewHolder a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        public d(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, int i2, Object obj) {
            this.a = helperRecyclerViewHolder;
            this.b = i;
            this.c = i2;
            this.d = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GroupedRecyclerViewAdapter.this.d != null) {
                GroupedRecyclerViewAdapter.this.d.onChildClick(GroupedRecyclerViewAdapter.this, this.a, this.b, this.c, this.d);
            }
        }
    }

    public class e extends RecyclerView.AdapterDataObserver {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            GroupedRecyclerViewAdapter.this.e = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            GroupedRecyclerViewAdapter.this.e = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            GroupedRecyclerViewAdapter.this.e = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            GroupedRecyclerViewAdapter.this.e = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    public GroupedRecyclerViewAdapter(Context context, List<T> list) {
        this.a = list;
        if (list == null) {
            this.a = new ArrayList();
        }
        this.mContext = context;
        registerAdapterDataObserver(new e());
    }

    private int e() {
        return countGroupRangeItem(0, this.mStructures.size());
    }

    private int f(int i, int i2) {
        int iJudgeType = judgeType(i);
        if (iJudgeType == 50000) {
            return getHeaderLayout(i2);
        }
        if (iJudgeType == 50001) {
            return getFooterLayout(i2);
        }
        if (iJudgeType == 50002) {
            return getChildLayout(i2);
        }
        return 0;
    }

    private void g() {
        this.mStructures.clear();
        int groupCount = getGroupCount();
        for (int i = 0; i < groupCount; i++) {
            this.mStructures.add(new GroupStructure(hasHeader(i), hasFooter(i), getChildrenCount(i)));
        }
        this.e = false;
    }

    public boolean addGroup(T t) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        boolean zAdd = t != null ? this.a.add(t) : false;
        g();
        notifyDataSetChanged();
        return zAdd;
    }

    public boolean addGroups(List<T> list) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        boolean zAddAll = false;
        if (list != null && !list.isEmpty()) {
            zAddAll = this.a.addAll(list);
        }
        g();
        notifyDataSetChanged();
        return zAddAll;
    }

    public void changeChild(int i, int i2) {
        int positionForChild = getPositionForChild(i, i2);
        if (positionForChild >= 0) {
            notifyItemChanged(positionForChild);
        }
    }

    public void changeChildren(int i) {
        int positionForChild;
        if (i >= this.mStructures.size() || (positionForChild = getPositionForChild(i, 0)) < 0) {
            return;
        }
        notifyItemRangeChanged(positionForChild, this.mStructures.get(i).getChildrenCount());
    }

    public void changeDataSet() {
        this.e = true;
        notifyDataSetChanged();
    }

    public void changeFooter(int i) {
        int positionForGroupFooter = getPositionForGroupFooter(i);
        if (positionForGroupFooter >= 0) {
            notifyItemChanged(positionForGroupFooter);
        }
    }

    public void changeGroup(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        int iCountGroupItem = countGroupItem(i);
        if (positionForGroupHeader < 0 || iCountGroupItem <= 0) {
            return;
        }
        notifyItemRangeChanged(positionForGroupHeader, iCountGroupItem);
    }

    public void changeHeader(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        if (positionForGroupHeader >= 0) {
            notifyItemChanged(positionForGroupHeader);
        }
    }

    public void changeRangeChild(int i, int i2, int i3) {
        int positionForChild;
        if (i >= this.mStructures.size() || (positionForChild = getPositionForChild(i, i2)) < 0) {
            return;
        }
        GroupStructure groupStructure = this.mStructures.get(i);
        if (groupStructure.getChildrenCount() >= i2 + i3) {
            notifyItemRangeChanged(positionForChild, i3);
        } else {
            notifyItemRangeChanged(positionForChild, groupStructure.getChildrenCount() - i2);
        }
    }

    public void changeRangeGroup(int i, int i2) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        int i3 = i2 + i;
        int iCountGroupRangeItem = i3 <= this.mStructures.size() ? countGroupRangeItem(i, i3) : countGroupRangeItem(i, this.mStructures.size());
        if (positionForGroupHeader < 0 || iCountGroupRangeItem <= 0) {
            return;
        }
        notifyItemRangeChanged(positionForGroupHeader, iCountGroupRangeItem);
    }

    public int countGroupItem(int i) {
        if (i >= this.mStructures.size()) {
            return 0;
        }
        GroupStructure groupStructure = this.mStructures.get(i);
        int childrenCount = (groupStructure.hasHeader() ? 1 : 0) + groupStructure.getChildrenCount();
        return groupStructure.hasFooter() ? childrenCount + 1 : childrenCount;
    }

    public int countGroupRangeItem(int i, int i2) {
        int size = this.mStructures.size();
        int iCountGroupItem = 0;
        for (int i3 = i; i3 < size && i3 < i + i2; i3++) {
            iCountGroupItem += countGroupItem(i3);
        }
        return iCountGroupItem;
    }

    public abstract int getChildLayout(int i);

    public int getChildPositionForPosition(int i, int i2) {
        if (i >= this.mStructures.size()) {
            return -1;
        }
        int iCountGroupRangeItem = countGroupRangeItem(0, i + 1);
        GroupStructure groupStructure = this.mStructures.get(i);
        int childrenCount = (groupStructure.getChildrenCount() - (iCountGroupRangeItem - i2)) + (groupStructure.hasFooter() ? 1 : 0);
        if (childrenCount >= 0) {
            return childrenCount;
        }
        return -1;
    }

    public int getChildSpanSize(int i, int i2) {
        return 1;
    }

    public int getChildViewType(int i, int i2) {
        return TYPE_CHILD;
    }

    public abstract int getChildrenCount(int i);

    public abstract int getFooterLayout(int i);

    public int getFooterViewType(int i) {
        return 50001;
    }

    public T getGroup(int i) {
        return this.a.get(i);
    }

    public abstract int getGroupCount();

    public int getGroupPositionForPosition(int i) {
        int size = this.mStructures.size();
        int iCountGroupItem = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iCountGroupItem += countGroupItem(i2);
            if (i < iCountGroupItem) {
                return i2;
            }
        }
        return -1;
    }

    public List<T> getGroups() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public abstract int getHeaderLayout(int i);

    public int getHeaderViewType(int i) {
        return 50000;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return itemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        this.f = i;
        int groupPositionForPosition = getGroupPositionForPosition(i);
        int iJudgeType = judgeType(i);
        if (iJudgeType == 50000) {
            return getHeaderViewType(groupPositionForPosition);
        }
        if (iJudgeType == 50001) {
            return getFooterViewType(groupPositionForPosition);
        }
        return iJudgeType == 50002 ? getChildViewType(groupPositionForPosition, getChildPositionForPosition(groupPositionForPosition, i)) : super.getItemViewType(i);
    }

    public int getPositionForChild(int i, int i2) {
        if (i >= this.mStructures.size()) {
            return -1;
        }
        GroupStructure groupStructure = this.mStructures.get(i);
        if (groupStructure.getChildrenCount() > i2) {
            return countGroupRangeItem(0, i) + i2 + (groupStructure.hasHeader() ? 1 : 0);
        }
        return -1;
    }

    public int getPositionForGroupFooter(int i) {
        if (i >= this.mStructures.size() || !this.mStructures.get(i).hasFooter()) {
            return -1;
        }
        return countGroupRangeItem(0, i + 1) - 1;
    }

    public int getPositionForGroupHeader(int i) {
        if (i >= this.mStructures.size() || !this.mStructures.get(i).hasHeader()) {
            return -1;
        }
        return countGroupRangeItem(0, i);
    }

    public abstract boolean hasFooter(int i);

    public abstract boolean hasHeader(int i);

    public void insertChild(int i, int i2) {
        if (i < this.mStructures.size()) {
            GroupStructure groupStructure = this.mStructures.get(i);
            int positionForChild = getPositionForChild(i, i2);
            if (positionForChild < 0) {
                positionForChild = groupStructure.getChildrenCount() + countGroupRangeItem(0, i) + (groupStructure.hasHeader() ? 1 : 0);
            }
            groupStructure.setChildrenCount(groupStructure.getChildrenCount() + 1);
            notifyItemInserted(positionForChild);
            notifyItemRangeChanged(positionForChild + 1, getA() - positionForChild);
        }
    }

    public void insertChildren(int i) {
        if (i < this.mStructures.size()) {
            int iCountGroupRangeItem = countGroupRangeItem(0, i);
            GroupStructure groupStructure = this.mStructures.get(i);
            if (groupStructure.hasHeader()) {
                iCountGroupRangeItem++;
            }
            int childrenCount = getChildrenCount(i);
            if (childrenCount > 0) {
                groupStructure.setChildrenCount(childrenCount);
                notifyItemRangeInserted(iCountGroupRangeItem, childrenCount);
                notifyItemRangeChanged(childrenCount + iCountGroupRangeItem, getA() - iCountGroupRangeItem);
            }
        }
    }

    public void insertFooter(int i) {
        if (i >= this.mStructures.size() || getPositionForGroupFooter(i) >= 0) {
            return;
        }
        this.mStructures.get(i).setHasFooter(true);
        int iCountGroupRangeItem = countGroupRangeItem(0, i + 1);
        notifyItemInserted(iCountGroupRangeItem);
        notifyItemRangeChanged(iCountGroupRangeItem + 1, getA() - iCountGroupRangeItem);
    }

    public void insertGroup(int i) {
        GroupStructure groupStructure = new GroupStructure(hasHeader(i), hasFooter(i), getChildrenCount(i));
        if (i < this.mStructures.size()) {
            this.mStructures.add(i, groupStructure);
        } else {
            this.mStructures.add(groupStructure);
            i = this.mStructures.size() - 1;
        }
        int iCountGroupRangeItem = countGroupRangeItem(0, i);
        int iCountGroupItem = countGroupItem(i);
        if (iCountGroupItem > 0) {
            notifyItemRangeInserted(iCountGroupRangeItem, iCountGroupItem);
            notifyItemRangeChanged(iCountGroupItem + iCountGroupRangeItem, getA() - iCountGroupRangeItem);
        }
    }

    public void insertHeader(int i) {
        if (i >= this.mStructures.size() || getPositionForGroupHeader(i) >= 0) {
            return;
        }
        this.mStructures.get(i).setHasHeader(true);
        int iCountGroupRangeItem = countGroupRangeItem(0, i);
        notifyItemInserted(iCountGroupRangeItem);
        notifyItemRangeChanged(iCountGroupRangeItem + 1, getA() - iCountGroupRangeItem);
    }

    public void insertRangeChild(int i, int i2, int i3) {
        if (i < this.mStructures.size()) {
            int iCountGroupRangeItem = countGroupRangeItem(0, i);
            GroupStructure groupStructure = this.mStructures.get(i);
            if (groupStructure.hasHeader()) {
                iCountGroupRangeItem++;
            }
            if (i2 >= groupStructure.getChildrenCount()) {
                i2 = groupStructure.getChildrenCount();
            }
            int i4 = iCountGroupRangeItem + i2;
            if (i3 > 0) {
                groupStructure.setChildrenCount(groupStructure.getChildrenCount() + i3);
                notifyItemRangeInserted(i4, i3);
                notifyItemRangeChanged(i3 + i4, getA() - i4);
            }
        }
    }

    public void insertRangeGroup(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = i; i3 < i2; i3++) {
            arrayList.add(new GroupStructure(hasHeader(i3), hasFooter(i3), getChildrenCount(i3)));
        }
        if (i < this.mStructures.size()) {
            this.mStructures.addAll(i, arrayList);
        } else {
            this.mStructures.addAll(arrayList);
            i = this.mStructures.size() - arrayList.size();
        }
        int iCountGroupRangeItem = countGroupRangeItem(0, i);
        int iCountGroupRangeItem2 = countGroupRangeItem(i, i2);
        if (iCountGroupRangeItem2 > 0) {
            notifyItemRangeInserted(iCountGroupRangeItem, iCountGroupRangeItem2);
            notifyItemRangeChanged(iCountGroupRangeItem2 + iCountGroupRangeItem, getA() - iCountGroupRangeItem);
        }
    }

    public int itemCount() {
        if (this.e) {
            g();
        }
        return e();
    }

    public int judgeType(int i) {
        int size = this.mStructures.size();
        int childrenCount = 0;
        for (int i2 = 0; i2 < size; i2++) {
            GroupStructure groupStructure = this.mStructures.get(i2);
            if (groupStructure.hasHeader() && i < (childrenCount = childrenCount + 1)) {
                return 50000;
            }
            childrenCount += groupStructure.getChildrenCount();
            if (i < childrenCount) {
                return TYPE_CHILD;
            }
            if (groupStructure.hasFooter() && i < (childrenCount = childrenCount + 1)) {
                return 50001;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        this.xRecyclerView = recyclerView instanceof XRecyclerView ? (XRecyclerView) recyclerView : null;
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager));
        }
        g();
    }

    public abstract void onBindChildViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, int i2, T t);

    public abstract void onBindFooterViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t);

    public abstract void onBindHeaderViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, T t);

    public void removeAll() {
        notifyItemRangeRemoved(0, getA());
        this.mStructures.clear();
    }

    public void removeChild(int i, int i2) {
        int positionForChild = getPositionForChild(i, i2);
        if (positionForChild >= 0) {
            GroupStructure groupStructure = this.mStructures.get(i);
            notifyItemRemoved(positionForChild);
            notifyItemRangeChanged(positionForChild, getA() - positionForChild);
            groupStructure.setChildrenCount(groupStructure.getChildrenCount() - 1);
        }
    }

    public void removeChildren(int i) {
        int positionForChild;
        if (i >= this.mStructures.size() || (positionForChild = getPositionForChild(i, 0)) < 0) {
            return;
        }
        GroupStructure groupStructure = this.mStructures.get(i);
        int childrenCount = groupStructure.getChildrenCount();
        notifyItemRangeRemoved(positionForChild, childrenCount);
        notifyItemRangeChanged(positionForChild, getA() - childrenCount);
        groupStructure.setChildrenCount(0);
    }

    public void removeFooter(int i) {
        int positionForGroupFooter = getPositionForGroupFooter(i);
        if (positionForGroupFooter >= 0) {
            GroupStructure groupStructure = this.mStructures.get(i);
            notifyItemRemoved(positionForGroupFooter);
            notifyItemRangeChanged(positionForGroupFooter, getA() - positionForGroupFooter);
            groupStructure.setHasFooter(false);
        }
    }

    public void removeGroup(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        int iCountGroupItem = countGroupItem(i);
        if (positionForGroupHeader < 0 || iCountGroupItem <= 0) {
            return;
        }
        notifyItemRangeRemoved(positionForGroupHeader, iCountGroupItem);
        notifyItemRangeChanged(positionForGroupHeader, getA() - iCountGroupItem);
        this.mStructures.remove(i);
    }

    public void removeHeader(int i) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        if (positionForGroupHeader >= 0) {
            GroupStructure groupStructure = this.mStructures.get(i);
            notifyItemRemoved(positionForGroupHeader);
            notifyItemRangeChanged(positionForGroupHeader, getA() - positionForGroupHeader);
            groupStructure.setHasHeader(false);
        }
    }

    public void removeRangeChild(int i, int i2, int i3) {
        int positionForChild;
        if (i >= this.mStructures.size() || (positionForChild = getPositionForChild(i, i2)) < 0) {
            return;
        }
        GroupStructure groupStructure = this.mStructures.get(i);
        int childrenCount = groupStructure.getChildrenCount();
        if (childrenCount < i2 + i3) {
            i3 = childrenCount - i2;
        }
        notifyItemRangeRemoved(positionForChild, i3);
        notifyItemRangeChanged(positionForChild, getA() - i3);
        groupStructure.setChildrenCount(childrenCount - i3);
    }

    public void removeRangeGroup(int i, int i2) {
        int positionForGroupHeader = getPositionForGroupHeader(i);
        int i3 = i2 + i;
        int iCountGroupRangeItem = i3 <= this.mStructures.size() ? countGroupRangeItem(i, i3) : countGroupRangeItem(i, this.mStructures.size());
        if (positionForGroupHeader < 0 || iCountGroupRangeItem <= 0) {
            return;
        }
        notifyItemRangeRemoved(positionForGroupHeader, iCountGroupRangeItem);
        notifyItemRangeChanged(positionForGroupHeader, getA() - iCountGroupRangeItem);
        this.mStructures.remove(i);
    }

    public boolean setGroups(List<T> list) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        boolean zAddAll = false;
        if (list != null && !list.isEmpty()) {
            zAddAll = this.a.addAll(list);
        }
        g();
        notifyDataSetChanged();
        return zAddAll;
    }

    public void setOnChildClickListener(OnChildClickListener onChildClickListener) {
        this.d = onChildClickListener;
    }

    public void setOnFooterClickListener(OnFooterClickListener onFooterClickListener) {
        this.c = onFooterClickListener;
    }

    public void setOnHeaderClickListener(OnHeaderClickListener onHeaderClickListener) {
        this.b = onHeaderClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((HelperRecyclerViewHolder) viewHolder, i, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public HelperRecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iF = f(this.f, i);
        return new HelperRecyclerViewHolder(LayoutInflater.from(this.mContext).inflate(iF, viewGroup, false), iF);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i) {
        int iJudgeType = judgeType(i);
        int groupPositionForPosition = getGroupPositionForPosition(i);
        T t = this.a.get(groupPositionForPosition);
        if (iJudgeType == 50000) {
            if (this.b != null) {
                helperRecyclerViewHolder.itemView.setOnClickListener(new b(helperRecyclerViewHolder, groupPositionForPosition, t));
            }
            onBindHeaderViewHolder(helperRecyclerViewHolder, groupPositionForPosition, t);
        } else if (iJudgeType == 50001) {
            if (this.c != null) {
                helperRecyclerViewHolder.itemView.setOnClickListener(new c(helperRecyclerViewHolder, groupPositionForPosition, t));
            }
            onBindFooterViewHolder(helperRecyclerViewHolder, groupPositionForPosition, t);
        } else if (iJudgeType == 50002) {
            int childPositionForPosition = getChildPositionForPosition(groupPositionForPosition, i);
            if (this.d != null) {
                helperRecyclerViewHolder.itemView.setOnClickListener(new d(helperRecyclerViewHolder, groupPositionForPosition, childPositionForPosition, t));
            }
            onBindChildViewHolder(helperRecyclerViewHolder, groupPositionForPosition, childPositionForPosition, t);
        }
    }

    public GroupedRecyclerViewAdapter(Context context) {
        this.mContext = context;
        registerAdapterDataObserver(new e());
    }

    public void onBindViewHolder(HelperRecyclerViewHolder helperRecyclerViewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(helperRecyclerViewHolder, i);
        } else {
            super.onBindViewHolder(helperRecyclerViewHolder, i, list);
        }
    }
}
