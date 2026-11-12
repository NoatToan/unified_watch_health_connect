package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.ahocorasick.trie.handler.EmitHandler;

/* JADX INFO: loaded from: classes20.dex */
public class zur implements EmitHandler {
    private List<zul> d = new ArrayList();

    @Override // org.ahocorasick.trie.handler.EmitHandler
    public void emit(zul zulVar) {
        this.d.add(zulVar);
    }

    public List<zul> c() {
        return this.d;
    }
}
