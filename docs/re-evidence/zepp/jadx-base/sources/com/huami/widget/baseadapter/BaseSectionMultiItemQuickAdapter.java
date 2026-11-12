package com.huami.widget.baseadapter;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.entity.IExpandable;
import com.huami.widget.baseadapter.SectionMultiEntity;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseSectionMultiItemQuickAdapter<T extends SectionMultiEntity, K extends BaseViewHolder> extends BaseQuickAdapter<T, K> {
    public static final int HEAD_LEFT = 1091;
    public static final int HEAD_TOP_BOTTOM = 1090;
    public static final int SECTION_HEADER_VIEW = 1092;
    public static final int TYPE_NOT_FOUND = -404;
    private static final int c = -255;
    private SparseIntArray a;
    private SparseIntArray b;
    public int mSectionHeadResId;

    public BaseSectionMultiItemQuickAdapter(int i, List<T> list) {
        super(list);
        this.mSectionHeadResId = i;
    }

    private int a(int i) {
        return this.b.get(i, -404);
    }

    private int getLayoutId(int i) {
        return this.a.get(i, -404);
    }

    public void addHeaderItemType(int i, @LayoutRes int i2) {
        if (this.b == null) {
            this.b = new SparseIntArray();
        }
        this.b.put(i, i2);
    }

    public void addItemType(int i, @LayoutRes int i2) {
        if (this.a == null) {
            this.a = new SparseIntArray();
        }
        this.a.put(i, i2);
    }

    public abstract void convertHead(K k, T t);

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public int getDefItemViewType(int i) {
        T t = this.mData.get(i);
        if (t == null) {
            return c;
        }
        if (!t.isHeader) {
            return t.getMyItemType();
        }
        if (t.getHeaderType() == 0) {
            return 1092;
        }
        return t.getHeaderType();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public boolean isFixedViewType(int i) {
        return super.isFixedViewType(i) || i == 1092 || i == 1091 || i == 1090;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public K onCreateDefViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1092) {
            return createBaseViewHolder(getItemView(this.mSectionHeadResId, viewGroup));
        }
        return (i == 1091 || i == 1090) ? createBaseViewHolder(viewGroup, a(i)) : createBaseViewHolder(viewGroup, getLayoutId(i));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void remove(@IntRange(from = 0) int i) {
        List<T> list = this.mData;
        if (list == null || i < 0 || i >= list.size()) {
            return;
        }
        T t = this.mData.get(i);
        if (t instanceof IExpandable) {
            removeAllChild((IExpandable) t, i);
        }
        removeDataFromParent(t);
        super.remove(i);
    }

    public void removeAllChild(IExpandable iExpandable, int i) {
        List subItems;
        if (!iExpandable.isExpanded() || (subItems = iExpandable.getSubItems()) == null || subItems.size() == 0) {
            return;
        }
        int size = subItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(i + 1);
        }
    }

    public void removeDataFromParent(T t) {
        int parentPosition = getParentPosition(t);
        if (parentPosition >= 0) {
            ((IExpandable) this.mData.get(parentPosition)).getSubItems().remove(t);
        }
    }

    public void setDefaultViewTypeLayout(@LayoutRes int i) {
        addItemType(c, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(K k, int i) {
        switch (k.getItemViewType()) {
            case HEAD_TOP_BOTTOM /* 1090 */:
            case HEAD_LEFT /* 1091 */:
            case 1092:
                setFullSpan(k);
                convertHead(k, getItem(i - getHeaderLayoutCount()));
                break;
            default:
                super.onBindViewHolder((BaseViewHolder) k, i);
                break;
        }
    }

    public BaseSectionMultiItemQuickAdapter(List<T> list) {
        super(list);
    }
}
