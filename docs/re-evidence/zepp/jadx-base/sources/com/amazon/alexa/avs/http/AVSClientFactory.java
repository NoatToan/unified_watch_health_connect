package com.amazon.alexa.avs.http;

import android.content.Context;
import com.amazon.alexa.avs.AlexaSupportUtils;
import com.amazon.alexa.avs.ResultListener;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class AVSClientFactory {
    private String countryCode;

    public AVSClientFactory(String str) {
        this.countryCode = str;
    }

    public AVSClient getAVSClient(Context context, MultipartParser.MultipartParserConsumer multipartParserConsumer, ParsingFailedHandler parsingFailedHandler, ResultListener resultListener) throws Exception {
        return new AVSClient(context, new URL(AlexaSupportUtils.getEndpoint(this.countryCode)), multipartParserConsumer, parsingFailedHandler, resultListener);
    }
}
