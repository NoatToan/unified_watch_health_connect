package com.ximalaya.ting.android.opensdk.model.coldboot;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class GenreList extends XimalayaResponse {
    private List<String> genreList;

    public List<String> getGenreList() {
        return this.genreList;
    }

    public void setGenreList(List<String> list) {
        this.genreList = list;
    }
}
