package miui.assistant.index;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public interface IAssistContentIndex {
    void batchIndexItems(Context context, List<AssistContentItem> list, IndexCallback indexCallback);

    void deleteAllIndexItems(Context context, IndexCallback indexCallback);

    void deleteIndexItem(Context context, String str, IndexCallback indexCallback);

    void indexItem(Context context, AssistContentItem assistContentItem, IndexCallback indexCallback);
}
