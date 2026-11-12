package com.huami.sleepassistant.apilib.db.po;

import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/sleepassistant/apilib/db/po/PostLiveMusicSortBean;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "getIds", "()Ljava/util/ArrayList;", "setIds", "(Ljava/util/ArrayList;)V", "ids", "", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", "b", "Ljava/util/List;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "list", "<init>", "()V", "apilib_release"}, k = 1, mv = {1, 5, 1})
public final class PostLiveMusicSortBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ArrayList<String> ids;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private List<LiveMusicVo> list;

    @Nullable
    public final ArrayList<String> getIds() {
        return this.ids;
    }

    @Nullable
    public final List<LiveMusicVo> getList() {
        return this.list;
    }

    public final void setIds(@Nullable ArrayList<String> arrayList) {
        this.ids = arrayList;
    }

    public final void setList(@Nullable List<LiveMusicVo> list) {
        this.list = list;
    }
}
