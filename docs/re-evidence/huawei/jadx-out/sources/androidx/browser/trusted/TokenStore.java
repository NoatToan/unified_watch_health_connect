package androidx.browser.trusted;

/* JADX INFO: loaded from: classes20.dex */
public interface TokenStore {
    Token load();

    void store(Token token);
}
