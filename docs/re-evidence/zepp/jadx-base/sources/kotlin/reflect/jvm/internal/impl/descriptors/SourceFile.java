package kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public interface SourceFile {
    public static final SourceFile NO_SOURCE_FILE = new a();

    public static class a implements SourceFile {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceFile
        @Nullable
        public String getName() {
            return null;
        }
    }

    @Nullable
    String getName();
}
