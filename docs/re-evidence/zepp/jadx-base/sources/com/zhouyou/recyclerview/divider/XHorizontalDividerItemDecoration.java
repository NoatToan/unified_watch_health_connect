package com.zhouyou.recyclerview.divider;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.zhouyou.recyclerview.XRecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class XHorizontalDividerItemDecoration extends HorizontalDividerItemDecoration {

    public static class Builder extends HorizontalDividerItemDecoration.Builder {
        public FlexibleDividerDecoration.VisibilityProvider l;

        public class a implements FlexibleDividerDecoration.VisibilityProvider {
            public a() {
            }

            @Override // com.zhouyou.recyclerview.divider.FlexibleDividerDecoration.VisibilityProvider
            public boolean shouldHideDivider(int i, RecyclerView recyclerView) {
                if (!(recyclerView instanceof XRecyclerView)) {
                    return false;
                }
                XRecyclerView xRecyclerView = (XRecyclerView) recyclerView;
                return Builder.this.m(i, xRecyclerView.getItemCount(), xRecyclerView.getHeadersCount() + 1, xRecyclerView.getFootersCount() + (xRecyclerView.isLoadingMoreEnabled() ? 2 : 1));
            }
        }

        public Builder(Context context) {
            super(context);
            this.l = new a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m(int i, int i2, int i3, int i4) {
            return i < i3 || i2 - i <= i4;
        }

        @Override // com.zhouyou.recyclerview.divider.HorizontalDividerItemDecoration.Builder
        public XHorizontalDividerItemDecoration build() {
            visibilityProvider(this.l);
            return new XHorizontalDividerItemDecoration(this);
        }
    }

    public XHorizontalDividerItemDecoration(HorizontalDividerItemDecoration.Builder builder) {
        super(builder);
    }
}
