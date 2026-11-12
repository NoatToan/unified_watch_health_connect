package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
class b {
    private static final int a(String str) {
        int iIndexOf$default;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, 0, false, 4, (Object) null);
        if (iIndexOf$default2 != 0) {
            if (iIndexOf$default2 > 0 && str.charAt(iIndexOf$default2 - 1) == ':') {
                return iIndexOf$default2 + 1;
            }
            if (iIndexOf$default2 == -1 && StringsKt__StringsKt.endsWith$default((CharSequence) str, JsonLexerKt.COLON, false, 2, (Object) null)) {
                return str.length();
            }
            return 0;
        }
        if (str.length() > 1) {
            char cCharAt = str.charAt(1);
            char c = File.separatorChar;
            if (cCharAt == c && (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, c, 2, false, 4, (Object) null)) >= 0) {
                int iIndexOf$default3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, File.separatorChar, iIndexOf$default + 1, false, 4, (Object) null);
                return iIndexOf$default3 >= 0 ? iIndexOf$default3 + 1 : str.length();
            }
        }
        return 1;
    }

    @NotNull
    public static final File getRoot(@NotNull File file) {
        return new File(getRootName(file));
    }

    @NotNull
    public static final String getRootName(@NotNull File file) {
        return file.getPath().substring(0, a(file.getPath()));
    }

    public static final boolean isRooted(@NotNull File file) {
        return a(file.getPath()) > 0;
    }

    @NotNull
    public static final File subPath(@NotNull File file, int i, int i2) {
        return toComponents(file).subPath(i, i2);
    }

    @NotNull
    public static final FilePathComponents toComponents(@NotNull File file) {
        List listEmptyList;
        String path = file.getPath();
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        String strSubstring2 = path.substring(iA);
        if (strSubstring2.length() == 0) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strSubstring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it2 = listSplit$default.iterator();
            while (it2.hasNext()) {
                arrayList.add(new File((String) it2.next()));
            }
            listEmptyList = arrayList;
        }
        return new FilePathComponents(new File(strSubstring), listEmptyList);
    }
}
