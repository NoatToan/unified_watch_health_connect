package com.baidu.ocr.sdk.model;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralResult extends ResponseResult {
    private int direction = -1;
    public List<? extends WordSimple> wordList;
    public int wordsResultNumber;

    public int getDirection() {
        return this.direction;
    }

    public List<? extends WordSimple> getWordList() {
        return this.wordList;
    }

    public int getWordsResultNumber() {
        return this.wordsResultNumber;
    }

    public void setDirection(int i) {
        this.direction = i;
    }

    public void setWordList(List<? extends WordSimple> list) {
        this.wordList = list;
    }

    public void setWordsResultNumber(int i) {
        this.wordsResultNumber = i;
    }
}
