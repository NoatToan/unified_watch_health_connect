package com.huami.assistant.sms.parse;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.assistant.sms.bean.Sms;
import com.huami.assistant.sms.parse.SmsParseUtil;
import com.huami.assistant.sms.parse.bean.CinemaTicket;
import com.huami.assistant.sms.parse.bean.Flight;
import com.huami.assistant.sms.parse.bean.TrainInfo;
import com.huami.assistant.sms.parse.protocol.DiDiProtocol;
import com.huami.assistant.sms.parse.protocol.IProtocol;
import com.huami.watch.util.ArraysUtil;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public enum SmsType {
    CINEMA_TICKET(new IProtocol<CinemaTicket>() { // from class: com.huami.assistant.sms.parse.protocol.CinemaTicketProtocol
        private static final String a = "CinemaTicketPtc";

        private long a(String body) {
            Calendar calendar = Calendar.getInstance();
            String[] strArrSplit = TextUtils.split(SmsParseUtil.match(body, "((\\d{4}\\D)?\\d{1,2}\\D\\d{2}\\D{0,2}\\d{2}\\D\\d{2})"), Pattern.compile("\\D+"));
            if (strArrSplit == null || strArrSplit.length < 4) {
                return calendar.getTimeInMillis();
            }
            int i = 0;
            if (strArrSplit.length == 5) {
                calendar.set(1, Integer.parseInt(strArrSplit[0]));
                i = 1;
            }
            int i2 = i + 1;
            calendar.set(2, Integer.parseInt(strArrSplit[i]) - 1);
            int i3 = i2 + 1;
            calendar.set(5, Integer.parseInt(strArrSplit[i2]));
            calendar.set(11, Integer.parseInt(strArrSplit[i3]));
            calendar.set(12, Integer.parseInt(strArrSplit[i3 + 1]));
            return calendar.getTimeInMillis();
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public boolean canHandle(String body) {
            return !TextUtils.isEmpty(SmsParseUtil.match(body, uniqueRex()));
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public String uniqueRex() {
            return "(取票码|取票密码|取票验证码)";
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public CinemaTicket parse(String body) {
            CinemaTicket cinemaTicket = new CinemaTicket();
            String strMatch = SmsParseUtil.match(body, "(《(.*?)》)");
            cinemaTicket.movieName = strMatch;
            if (TextUtils.isEmpty(strMatch)) {
                cinemaTicket.movieName = SmsParseUtil.match(body, "(?:\\d{2}\\(.+\\),)([^,]+)");
            }
            if (TextUtils.isEmpty(cinemaTicket.movieName)) {
                cinemaTicket.movieName = SmsParseUtil.match(body, "(【(.*?)】|\\[(.*?)\\])");
            }
            cinemaTicket.startTime = a(body);
            cinemaTicket.checkCode = SmsParseUtil.match(body, "(?:取票码|取票密码|取票验证码)\\D*([\\d\\s]+)");
            cinemaTicket.content = body;
            return cinemaTicket;
        }
    }),
    DIDI(new DiDiProtocol()),
    TRAININFO(new IProtocol<TrainInfo>() { // from class: com.huami.assistant.sms.parse.protocol.TrainInfoProtocol
        private static final String a = "TrainInfoProtocol";

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public boolean canHandle(String body) {
            return !TextUtils.isEmpty(SmsParseUtil.match(body, uniqueRex()));
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public String uniqueRex() {
            return "【(铁路客服)】|\\[(铁路客服)\\]";
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public TrainInfo parse(String body) {
            TrainInfo trainInfo = new TrainInfo();
            trainInfo.title = SmsParseUtil.match(body, "【(.*?)】|\\[(.*?)\\]");
            trainInfo.departureDate = SmsParseUtil.match(body, "(\\d{0,2}月\\d{0,2}日)");
            trainInfo.number = SmsParseUtil.match(body, "((?:G|T|K|D|L|g|t|k|d|l|\\d{1})\\d*次)");
            trainInfo.seat = SmsParseUtil.match(body, "(\\d*车\\S*号)");
            trainInfo.ticketEntrance = SmsParseUtil.match(body, "检票口[：|:](\\d{1,2}[a_z|A_z]?)");
            trainInfo.startingStation = SmsParseUtil.match(body, ",(\\D*站)");
            trainInfo.departureTime = SmsParseUtil.match(body, "(\\d{0,2}:\\d{0,2})开");
            trainInfo.content = body;
            return trainInfo;
        }
    }),
    FLIGHT(new IProtocol<Flight>() { // from class: com.huami.assistant.sms.parse.protocol.FlightProtocol
        private long a(@NonNull String timeStr) {
            Calendar calendar = Calendar.getInstance();
            String[] strArrSplit = TextUtils.split(timeStr, Pattern.compile("\\D+"));
            if (strArrSplit == null || strArrSplit.length < 4) {
                return calendar.getTimeInMillis();
            }
            int i = 0;
            if (strArrSplit.length == 5) {
                calendar.set(1, Integer.parseInt(strArrSplit[0]));
                i = 1;
            }
            int i2 = i + 1;
            calendar.set(2, Integer.parseInt(strArrSplit[i]) - 1);
            int i3 = i2 + 1;
            calendar.set(5, Integer.parseInt(strArrSplit[i2]));
            calendar.set(11, Integer.parseInt(strArrSplit[i3]));
            calendar.set(12, Integer.parseInt(strArrSplit[i3 + 1]));
            return calendar.getTimeInMillis();
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public boolean canHandle(String body) {
            return !TextUtils.isEmpty(SmsParseUtil.match(body, uniqueRex()));
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public String uniqueRex() {
            return "([A-Z|\\d]{2}\\d{3,4}[A|K]?)";
        }

        @Override // com.huami.assistant.sms.parse.protocol.IProtocol
        public Flight parse(String body) {
            Flight flight = new Flight();
            String strMatch = SmsParseUtil.match(body, uniqueRex());
            flight.fightNumber = strMatch;
            if (TextUtils.isEmpty(strMatch)) {
                return null;
            }
            List<String> listMatchAll = SmsParseUtil.matchAll(body, "([\\u4E00-\\u9FFF]+机场(T\\d+)?)");
            if (ArraysUtil.isEmpty(listMatchAll)) {
                return null;
            }
            flight.takeoffAirport = listMatchAll.get(0);
            if (listMatchAll.size() > 1) {
                flight.arriveAirport = listMatchAll.get(1);
            } else {
                flight.arriveAirport = "";
            }
            List<String> listMatchAll2 = SmsParseUtil.matchAll(body, "((\\d{4}\\D)?\\d{1,2}\\D\\d{2}\\D{0,2}\\d{2}\\D\\d{2})");
            if (listMatchAll2.size() > 0) {
                flight.takeoffTime = a(listMatchAll2.get(0));
            }
            if (listMatchAll2.size() > 1) {
                flight.arriveTime = a(listMatchAll2.get(1));
            }
            if (flight.takeoffTime <= 0) {
                return null;
            }
            flight.content = body;
            return flight;
        }
    });

    public IProtocol<? extends Sms> protocol;

    SmsType(IProtocol protocol) {
        this.protocol = protocol;
    }
}
