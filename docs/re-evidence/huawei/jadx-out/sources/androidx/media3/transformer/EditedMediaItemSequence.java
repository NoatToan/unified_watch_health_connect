package androidx.media3.transformer;

import androidx.media3.common.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class EditedMediaItemSequence {
    public final ImmutableList<EditedMediaItem> editedMediaItems;
    public final boolean isLooping;

    public EditedMediaItemSequence(EditedMediaItem editedMediaItem, EditedMediaItem... editedMediaItemArr) {
        this(new ImmutableList.c().add(editedMediaItem).add((Object[]) editedMediaItemArr).build());
    }

    public EditedMediaItemSequence(List<EditedMediaItem> list) {
        this(list, false);
    }

    public EditedMediaItemSequence(List<EditedMediaItem> list, boolean z) {
        Assertions.checkArgument(!list.isEmpty());
        this.editedMediaItems = ImmutableList.copyOf((Collection) list);
        this.isLooping = z;
    }
}
