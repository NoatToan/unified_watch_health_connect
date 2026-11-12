package com.xiaomi.ai.nlp.tokenizer.dict;

/* JADX INFO: loaded from: classes7.dex */
public enum SpecialWord {
    START_OF_SENTENCE("<s>", -1000),
    END_OF_SENTENCE("</s>", -1001),
    UNK_WORD("<unk>", -1002);

    private final int index;
    private final String word;

    SpecialWord(String str, int i) {
        this.word = str;
        this.index = i;
    }

    public int getIndex() {
        return this.index;
    }

    public String getWord() {
        return this.word;
    }
}
