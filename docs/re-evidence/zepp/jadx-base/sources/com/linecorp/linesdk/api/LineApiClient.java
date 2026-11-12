package com.linecorp.linesdk.api;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

/* JADX INFO: loaded from: classes18.dex */
public interface LineApiClient {
    @NonNull
    LineApiResponse<LineAccessToken> getCurrentAccessToken();

    @NonNull
    LineApiResponse<LineProfile> getProfile();

    @NonNull
    LineApiResponse<?> logout();

    @NonNull
    LineApiResponse<LineAccessToken> refreshAccessToken();

    @NonNull
    LineApiResponse<LineCredential> verifyToken();
}
