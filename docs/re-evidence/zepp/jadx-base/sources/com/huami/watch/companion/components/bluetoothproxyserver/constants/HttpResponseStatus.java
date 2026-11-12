package com.huami.watch.companion.components.bluetoothproxyserver.constants;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.infra.galaxy.fds.Common;

/* JADX INFO: loaded from: classes16.dex */
public enum HttpResponseStatus {
    _100(100, SportAnalytics.Params.VALUE_CONTINUE),
    _101(101, "Switching Protocols"),
    _102(102, "Processing"),
    _200(200, "OK"),
    _201(201, "Accepted"),
    _202(202, "Processing"),
    _203(203, "Non-Authoritative Information"),
    _204(204, "No Content"),
    _205(205, "Reset Content"),
    _206(206, "Partial Content"),
    _207(207, "Multi-Status"),
    _300(300, "Multiple Choices"),
    _301(301, "Moved Permanently"),
    _302(302, "Found"),
    _303(303, "See Other"),
    _304(304, "Not Modified"),
    _305(305, "Use Proxy"),
    _306(306, "Switch Proxy"),
    _307(307, "Temporary Redirect"),
    _400(400, "Bad Request"),
    _401(401, StatEvent.EVENT_WEIBO_VIEW_NUM_UNAUTHORIZED),
    _402(402, "Payment Required"),
    _403(403, "Forbidden"),
    _404(404, "Not Found"),
    _405(Common.HTTP_STATUS_METHOD_NOT_ALLOWED, "Method Not Allowed"),
    _406(406, "Not Acceptable"),
    _407(407, "Proxy Authentication Required"),
    _408(408, "Request Timeout"),
    _409(Common.HTTP_STATUS_CONFLICT, "Conflict"),
    _410(410, "Gone"),
    _411(411, "Length Required"),
    _412(412, "Precondition Failed"),
    _413(413, "Request Entity Too Large"),
    _414(414, "Request-URI Too Long"),
    _415(415, "Unsupported Media Type"),
    _416(416, "Requested Range Not Satisfiable"),
    _417(417, "Expectation Failed"),
    _418(418, "I'm a teapot"),
    _421(421, "There are too many connections from your internet address"),
    _422(TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, "Unprocessable Entity"),
    _423(TypedValues.CycleType.TYPE_WAVE_PERIOD, "Locked"),
    _424(424, "Failed Dependency"),
    _425(425, "Unordered Collection"),
    _426(426, "Upgrade Required"),
    _449(449, "Retry With"),
    _451(451, "Unavailable For Legal Reasons"),
    _500(500, "Internal Server Error"),
    _501(501, "Not Implemented"),
    _502(502, "Bad Gateway"),
    _503(503, "Service Unavailable"),
    _504(504, "Gateway Timeout"),
    _505(TypedValues.PositionType.TYPE_SIZE_PERCENT, "HTTP Version Not Supported"),
    _506(TypedValues.PositionType.TYPE_PERCENT_X, "Variant Also Negotiates"),
    _507(TypedValues.PositionType.TYPE_PERCENT_Y, "Insufficient Storage"),
    _509(509, "Bandwidth Limit Exceeded"),
    _510(510, "Not Extended");

    private String description;
    private int status;

    HttpResponseStatus(int i, String str) {
        this.status = i;
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }

    public int getStatus() {
        return this.status;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
