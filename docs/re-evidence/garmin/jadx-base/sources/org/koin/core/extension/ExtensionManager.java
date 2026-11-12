package org.koin.core.extension;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0011\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\nH\u0086\b¢\u0006\u0002\u0010\u0014J$\u0010\u0015\u001a\u0004\u0018\u0001H\u0012\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\nH\u0086\b¢\u0006\u0002\u0010\u0014J%\u0010\u0016\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u0002H\u0012¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R8\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lorg/koin/core/extension/ExtensionManager;", "", "_koin", "Lorg/koin/core/Koin;", "<init>", "(Lorg/koin/core/Koin;)V", "get_koin$koin_core", "()Lorg/koin/core/Koin;", "extensions", "Ljava/util/HashMap;", "", "Lorg/koin/core/extension/KoinExtension;", "Lkotlin/collections/HashMap;", "getExtensions$annotations", "()V", "getExtensions", "()Ljava/util/HashMap;", "getExtension", "T", TtmlNode.ATTR_ID, "(Ljava/lang/String;)Lorg/koin/core/extension/KoinExtension;", "getExtensionOrNull", "registerExtension", "", "extension", "(Ljava/lang/String;Lorg/koin/core/extension/KoinExtension;)V", "close", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@KoinInternalApi
public final class ExtensionManager {
    private final Koin _koin;
    private final HashMap<String, KoinExtension> extensions;

    public ExtensionManager(Koin koin) {
        koin.getClass();
        this._koin = koin;
        this.extensions = new HashMap<>();
    }

    public static /* synthetic */ void getExtensions$annotations() {
    }

    public final void close() {
        Collection<KoinExtension> collectionValues = this.extensions.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((KoinExtension) it.next()).onClose();
        }
    }

    public final <T extends KoinExtension> T getExtension(String id3) {
        id3.getClass();
        getExtensions().get(id3);
        s.l();
        throw null;
    }

    public final <T extends KoinExtension> T getExtensionOrNull(String id3) {
        id3.getClass();
        getExtensions().get(id3);
        s.l();
        throw null;
    }

    public final HashMap<String, KoinExtension> getExtensions() {
        return this.extensions;
    }

    /* JADX INFO: renamed from: get_koin$koin_core, reason: from getter */
    public final Koin get_koin() {
        return this._koin;
    }

    public final <T extends KoinExtension> void registerExtension(String id3, T extension) {
        id3.getClass();
        extension.getClass();
        this.extensions.put(id3, extension);
        extension.onRegister(this._koin);
    }
}
