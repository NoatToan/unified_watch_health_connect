package com.huami.training.db;

import androidx.room.TypeConverter;
import com.huami.training.dto.GenderPair;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0007¨\u0006\n"}, d2 = {"Lcom/huami/training/db/GenderPairConverter;", "", "Lcom/huami/training/dto/GenderPair;", "", "pair", "genderStringPairToString", "string", "stringToGenderStringPair", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class GenderPairConverter {
    @TypeConverter
    @Nullable
    public final String genderStringPairToString(@Nullable GenderPair<String> pair) {
        if (pair == null) {
            return null;
        }
        return pair.getFemale() + ',' + pair.getMale();
    }

    @TypeConverter
    @Nullable
    public final GenderPair<String> stringToGenderStringPair(@Nullable String string) {
        if (string == null) {
            return null;
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            return null;
        }
        return new GenderPair<>((String) listSplit$default.get(1), (String) listSplit$default.get(0));
    }
}
