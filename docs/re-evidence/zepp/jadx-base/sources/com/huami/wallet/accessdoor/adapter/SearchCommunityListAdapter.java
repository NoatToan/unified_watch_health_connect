package com.huami.wallet.accessdoor.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.nfc.door.entity.CommunityNameEntity;
import com.huami.wallet.accessdoor.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/wallet/accessdoor/adapter/SearchCommunityListAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/huami/nfc/door/entity/CommunityNameEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "convert", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public final class SearchCommunityListAdapter extends BaseQuickAdapter<CommunityNameEntity, BaseViewHolder> {
    public SearchCommunityListAdapter() {
        super(R.layout.item_search_community);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull CommunityNameEntity item) {
        helper.setText(R.id.tv_community_name, item.getName());
    }
}
