package com.datatheorem.android.trustkit.config;

import androidx.core.app.NotificationCompat;
import androidx.room.FtsOptions;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AnalyticsEvents;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.assistant.ocr.model.train.TrainKeys;
import com.huami.chart.style.constant.StyleConstant;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.huami.module.homepage.cards.business.healthstate.HealthStateCardView;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.passport.Configs;
import com.huami.sky.ui.play.notification.SkyPlayNotification;
import com.huami.sleep.model.DataConstant;
import com.huami.watch.companion.BuildConfig;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.companion.sport.SportSortConfig;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.tencent.open.SocialConstants;
import com.twitter.sdk.android.core.identity.AuthHandler;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.ai.core.AivsConfig;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.locweather.WeatherAPINewKt;
import com.xiaomi.hm.health.model.account.HMCalendarConfig;
import com.xiaomi.hm.health.push.Type;
import com.xiaomi.hm.health.relation.OperationType;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.xiaomi.market.sdk.Constants;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.Serializable;
import java.net.IDN;
import java.util.Arrays;
import java.util.Locale;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes2.dex */
class DomainValidator implements Serializable {
    private static final int d = 253;
    private static final String[] e;
    private static final String f = "\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final String g = "\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?";
    private static final String h = "^(?:\\p{Alnum}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?\\.)+(\\p{Alpha}(?>[\\p{Alnum}-]{0,61}\\p{Alnum})?)\\.?$";
    private static final DomainValidator i = new DomainValidator(false);
    private static final DomainValidator j = new DomainValidator(true);
    private static final String[] k = {"arpa"};
    private static final String[] l = {"aaa", "aarp", "abb", "abbott", "abbvie", "abogado", "abudhabi", "academy", "accenture", "accountant", "accountants", "aco", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "actor", "adac", "ads", "adult", "aeg", "aero", "afl", "agakhan", "agency", "aig", "airforce", "airtel", "akdn", "alibaba", "alipay", "allfinanz", "ally", "alsace", "amica", "amsterdam", "analytics", "android", "anquan", "apartments", "app", "apple", "aquarelle", "aramco", "archi", "army", "arte", "asia", "associates", "attorney", "auction", "audi", "audio", "author", "auto", "autos", "avianca", "aws", "axa", "azure", "baby", "baidu", "band", "bank", StyleConstant.BAR_STYLE, "barcelona", "barclaycard", "barclays", "barefoot", "bargains", "bauhaus", "bayern", "bbc", "bbva", "bcg", "bcn", com.xiaomi.hm.health.device.firmware.a.y, "beer", "bentley", "berlin", "best", "bet", "bharti", "bible", "bid", "bike", "bing", "bingo", "bio", com.alipay.sdk.m.k.b.l, OperationType.Black, "blackfriday", "bloomberg", "blue", "bms", "bmw", "bnl", "bnpparibas", "boats", "boehringer", "bom", "bond", "boo", "book", "boots", "bosch", "bostik", "bot", "boutique", "bradesco", "bridgestone", "broadway", "broker", "brother", "brussels", "budapest", "bugatti", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "builders", "business", "buy", "buzz", "bzh", "cab", "cafe", "cal", NotificationCompat.CATEGORY_CALL, "camera", "camp", "cancerresearch", "canon", "capetown", "capital", "car", "caravan", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, Type.CARE_MESSAGE, "career", "careers", "cars", "cartier", "casa", "cash", "casino", "cat", "catering", "cba", "cbn", "ceb", com.google.android.exoplayer2.text.ttml.b.m0, "ceo", "cern", "cfa", "cfd", "chanel", "channel", "chase", "chat", "cheap", "chloe", "christmas", "chrome", "church", "cipriani", "circle", "cisco", "citic", "city", "cityeats", "claims", "cleaning", "click", "clinic", "clinique", "clothing", "cloud", "club", "clubmed", "coach", "codes", "coffee", "college", "cologne", "com", "commbank", "community", "company", "compare", "computer", "comsec", "condos", "construction", "consulting", ContactSettingItemActivity.KEY_CONTACT, "contractors", "cooking", "cool", "coop", "corsica", "country", FirebaseAnalytics.Param.COUPON, "coupons", "courses", "credit", "creditcard", "creditunion", FitnessActivities.CRICKET, "crown", "crs", "cruises", "csc", "cuisinella", "cymru", "cyou", "dabur", "dad", "dance", "date", "dating", "datsun", "day", "dclk", "dealer", "deals", "degree", "delivery", "dell", "deloitte", "delta", "democrat", "dental", "dentist", "desi", "design", "dev", "diamonds", "diet", "digital", "direct", "directory", FirebaseAnalytics.Param.DISCOUNT, "dnp", "docs", "dog", "doha", Configs.Params.DOMAINS, WatchFaceApi.SORT_DOWNLOAD, "drive", "dubai", "durban", "dvag", "earth", "eat", "edeka", "edu", "education", "email", "emerck", "energy", "engineer", "engineering", "enterprises", "epson", "equipment", "erni", "esq", "estate", "eurovision", "eus", "events", "everbank", "exchange", "expert", "exposed", "express", "extraspace", "fage", "fail", "fairwinds", "faith", "family", "fan", "fans", "farm", "fashion", "fast", "feedback", "ferrero", "film", "final", "finance", "financial", "firestone", "firmdale", "fish", "fishing", "fit", "fitness", "flickr", "flights", "florist", "flowers", "flsmidth", WorkoutExercises.FLY, "foo", "football", "ford", "forex", "forsale", "forum", "foundation", "fox", "fresenius", "frl", "frogans", "frontier", "ftr", "fund", "furniture", "futbol", "fyi", "gal", "gallery", "gallo", "gallup", "game", "garden", "gbiz", "gdn", "gea", "gent", "genting", "ggee", "gift", "gifts", "gives", "giving", "glass", "gle", "global", "globo", "gmail", "gmbh", "gmo", "gmx", "gold", "goldpoint", FitnessActivities.GOLF, "goo", "goog", "google", "gop", "got", "gov", "grainger", "graphics", "gratis", "green", "gripe", "group", "gucci", "guge", "guide", "guitars", "guru", "hamburg", "hangout", "haus", "hdfcbank", "health", "healthcare", "help", "helsinki", "here", "hermes", "hiphop", "hitachi", "hiv", FitnessActivities.HOCKEY, "holdings", "holiday", "homedepot", "homes", "honda", "horse", "host", "hosting", "hoteles", "hotmail", "house", "how", "hsbc", "htc", "hyundai", "ibm", "icbc", "ice", FtsOptions.TOKENIZER_ICU, "ifm", "iinet", "imamat", "immo", "immobilien", "industries", "infiniti", "info", "ing", "ink", "institute", "insurance", "insure", "int", "international", "investments", "ipiranga", "irish", "iselect", "ismaili", "ist", "istanbul", "itau", "iwc", "jaguar", "java", "jcb", "jcp", "jetzt", "jewelry", "jlc", "jll", "jmp", "jnj", "jobs", "joburg", "jot", "joy", "jpmorgan", "jprs", "juegos", "kaufen", "kddi", "kerryhotels", "kerrylogistics", "kerryproperties", "kfh", "kia", "kim", "kinder", "kitchen", "kiwi", "koeln", "komatsu", "kpmg", "kpn", "krd", "kred", "kuokgroup", "kyoto", "lacaixa", "lamborghini", "lamer", "lancaster", "land", "landrover", "lanxess", "lasalle", GPXBasePoint.XML.ATTR_LAT, "latrobe", "law", "lawyer", "lds", "lease", "leclerc", "legal", "lexus", "lgbt", "liaison", "lidl", "life", "lifeinsurance", "lifestyle", "lighting", SkyPlayNotification.SKY_NOTIFICATION_LIKE, WeatherAPINewKt.FLAG_LIMITED, "limo", "lincoln", "linde", "link", "live", "living", "lixil", "loan", "loans", "locus", "lol", "london", "lotte", "lotto", "love", "ltd", "ltda", "lupin", "luxe", "luxury", "madrid", "maif", "maison", "makeup", "man", "management", "mango", "market", Configs.Params.MARKETING, "markets", "marriott", "mba", "med", "media", "meet", "melbourne", "meme", "memorial", "men", "menu", "meo", "miami", "microsoft", "mil", "mini", "mls", "mma", "mobi", "mobily", "moda", "moe", "moi", "mom", "monash", "money", "montblanc", "mormon", "mortgage", "moscow", "motorcycles", "mov", "movie", "movistar", "mtn", "mtpc", "mtr", "museum", "mutual", "mutuelle", "nadex", "nagoya", "name", "natura", "navy", "nec", com.alipay.sdk.m.k.b.k, "netbank", "network", "neustar", "new", VoiceConfigFuncKt.NEWS, "nexus", "ngo", "nhk", "nico", "nikon", "ninja", "nissan", "nissay", "nokia", "northwesternmutual", "norton", "nowruz", "nra", "nrw", "ntt", "nyc", "obi", "office", "okinawa", "omega", "one", "ong", "onl", "online", "ooo", "oracle", "orange", "org", "organic", "origins", "osaka", "otsuka", "ovh", DTransferConstants.PAGE, "pamperedchef", "panerai", "paris", "pars", "partners", "parts", "party", "passagens", "pet", "pharmacy", "philips", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "photography", "photos", "physio", "piaget", SocialConstants.PARAM_IMAGE, "pictet", "pictures", DTransferConstants.PID, Constant.KEY_PIN, "ping", "pink", "pizza", "place", "play", "playstation", "plumbing", "plus", "pohl", "poker", "porn", DataItem.HTTP_METHOD_POST, "praxi", "press", com.xiaomi.hm.health.device.firmware.a.g, "prod", "productions", "prof", "progressive", NotificationCompat.CATEGORY_PROMO, Configs.Params.PROPERTIES, "property", "protection", "pub", "pwc", "qpon", "quebec", "quest", "racing", "read", "realtor", "realty", "recipes", "red", "redstone", "redumbrella", "rehab", "reise", "reisen", "reit", "ren", "rent", "rentals", "repair", PointCategory.REPORT, "republican", "rest", "restaurant", "review", "reviews", "rexroth", "rich", "ricoh", com.xiaomi.hm.health.device.firmware.a.O, "rip", "rocher", "rocks", "rodeo", "room", "rsvp", "ruhr", "run", "rwe", "ryukyu", "saarland", "safe", "safety", "sakura", "sale", "salon", "samsung", "sandvik", "sandvikcoromant", "sanofi", "sap", "sapo", "sarl", "sas", "saxo", "sbi", "sbs", "sca", "scb", "schaeffler", "schmidt", "scholarships", "school", "schule", "schwarz", "science", "scor", "scot", TrainKeys.SEAT, "security", "seek", "select", "sener", "services", "seven", "sew", "sex", "sexy", "sfr", "sharp", "shaw", "shell", "shia", "shiksha", StatEvent.SPORT_TP_VALUE_SHOES, "shouji", "show", "shriram", "sina", "singles", "site", "ski", "skin", HMIntentHandler.NAME_SKY, "skype", "smile", "sncf", SportSortConfig.KEY_SOCCER_ORDER, NotificationCompat.CATEGORY_SOCIAL, "softbank", "software", "sohu", HMCalendarConfig.VALUE_SOLAR, "solutions", "song", "sony", "soy", "space", "spiegel", "spot", "spreadbetting", "srl", "stada", "star", "starhub", "statebank", "statefarm", "statoil", "stc", "stcgroup", "stockholm", "storage", "store", AivsConfig.Tts.AUDIO_TYPE_STREAM, "studio", "study", "style", "sucks", "supplies", StatEvent.COURSE_V_SUPPLY, "support", "surf", "surgery", "suzuki", "swatch", "swiss", "sydney", "symantec", "systems", "tab", "taipei", "talk", "taobao", "tatamotors", "tatar", "tattoo", FirebaseAnalytics.Param.TAX, "taxi", "tci", "team", "tech", "technology", "tel", "telecity", "telefonica", "temasek", "tennis", "teva", "thd", "theater", "theatre", "tickets", "tienda", "tiffany", "tips", "tires", "tirol", "tmall", "today", "tokyo", "tools", "top", "toray", "toshiba", "total", "tours", "town", "toyota", "toys", "trade", "trading", "training", "travel", "travelers", "travelersinsurance", "trust", "trv", "tube", "tui", "tunes", "tushu", "tvs", "ubs", "unicom", "university", "uno", "uol", "vacations", "vana", "vegas", "ventures", "verisign", "versicherung", "vet", "viajes", "video", "vig", "viking", "villas", "vin", "vip", "virgin", "vision", "vista", "vistaprint", "viva", "vlaanderen", "vodka", "volkswagen", "vote", "voting", "voto", "voyage", "vuelos", "wales", "walter", "wang", "wanggou", "watch", "watches", "weather", "weatherchannel", "webcam", "weber", "website", HMCalendarConfig.VALUE_WED, "wedding", "weibo", "weir", "whoswho", "wien", "wiki", "williamhill", "win", "windows", "wine", "wme", "wolterskluwer", "work", "works", "world", "wtc", "wtf", "xbox", "xerox", "xihuan", "xin", "xn--11b4c3d", "xn--1ck2e1b", "xn--1qqw23a", "xn--30rr7y", "xn--3bst00m", "xn--3ds443g", "xn--3pxu8k", "xn--42c2d9a", "xn--45q11c", "xn--4gbrim", "xn--55qw42g", "xn--55qx5d", "xn--5tzm5g", "xn--6frz82g", "xn--6qq986b3xl", "xn--80adxhks", "xn--80asehdb", "xn--80aswg", "xn--8y0a063a", "xn--9dbq2a", "xn--9et52u", "xn--9krt00a", "xn--b4w605ferd", "xn--bck1b9a5dre4c", "xn--c1avg", "xn--c2br7g", "xn--cck2b3b", "xn--cg4bki", "xn--czr694b", "xn--czrs0t", "xn--czru2d", "xn--d1acj3b", "xn--eckvdtc9d", "xn--efvy88h", "xn--estv75g", "xn--fct429k", "xn--fhbei", "xn--fiq228c5hs", "xn--fiq64b", "xn--fjq720a", "xn--flw351e", "xn--g2xx48c", "xn--gckr3f0f", "xn--hxt814e", "xn--i1b6b1a6a2e", "xn--imr513n", "xn--io0a7i", "xn--j1aef", "xn--jlq61u9w7b", "xn--jvr189m", "xn--kcrx77d1x4a", "xn--kpu716f", "xn--kput3i", "xn--mgba3a3ejt", "xn--mgbab2bd", "xn--mgbb9fbpob", "xn--mgbca7dzdo", "xn--mgbt3dhd", "xn--mk1bu44c", "xn--mxtq1m", "xn--ngbc5azd", "xn--ngbe9e0a", "xn--nqv7f", "xn--nqv7fs00ema", "xn--nyqy26a", "xn--p1acf", "xn--pbt977c", "xn--pssy2u", "xn--q9jyb4c", "xn--qcka1pmc", "xn--rhqv96g", "xn--rovu88b", "xn--ses554g", "xn--t60b56a", "xn--tckwe", "xn--unup4y", "xn--vermgensberater-ctb", "xn--vermgensberatung-pwb", "xn--vhquv", "xn--vuq861b", "xn--w4r85el8fhu5dnra", "xn--xhq521b", "xn--zfr164b", "xperia", "xxx", "xyz", "yachts", "yahoo", "yamaxun", "yandex", "yodobashi", FitnessActivities.YOGA, "yokohama", "you", "youtube", "yun", "zara", "zero", "zip", "zone", "zuerich"};
    private static final String[] m = {"ac", "ad", "ae", "af", com.xiaomi.hm.health.Constant.PAI_KEY_AGE, "ai", "al", "am", "ao", "aq", "ar", com.xiaomi.hm.health.Constant.PAI_KEY_ACTIVITY_SCORES, "at", "au", "aw", "ax", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", com.google.android.exoplayer2.text.ttml.b.t, "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cd", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", Constants.JSON_COUNTRY, "cr", "cu", "cv", "cw", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "er", "es", "et", "eu", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", com.xiaomi.hm.health.Constant.PAI_KEY_GENDER, UserDataStore.GENDER, "gf", "gg", "gh", "gi", "gl", "gm", "gn", "gp", "gq", "gr", "gs", "gt", "gu", "gw", "gy", "hk", com.xiaomi.hm.health.Constant.PAI_KEY_HIGH_ZONE_MINUTES, "hn", com.huami.mifit.sportlib.common.Constants.DATA_KEY_HR, "ht", "hu", "id", "ie", "il", "im", Argument.IN, "io", "iq", "ir", "is", "it", "je", "jm", "jo", "jp", "ke", "kg", "kh", "ki", SportAnalytics.ParamValue.MapButtonType.KM, "kn", "kp", "kr", "kw", "ky", "kz", Constants.JSON_LANGUAGE, "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", BuildConfig.WX_NAME, TournamentShareDialogURIBuilder.me, "mg", "mh", "mk", "ml", com.xiaomi.hm.health.Constant.PAI_KEY_MEDIUM_ZONE_MINUTES, "mn", "mo", com.xiaomi.hm.health.Constant.PAI_KEY_MEDIUM_ZONE_PAI, "mq", "mr", "ms", "mt", "mu", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nu", "nz", "om", com.alipay.sdk.m.l.b.k, "pe", com.tencent.connect.common.Constants.PARAM_PLATFORM_ID, "pg", UserDataStore.PHONE, "pk", "pl", "pm", "pn", "pr", "ps", "pt", "pw", "py", "qa", "re", Language.RO, "rs", HealthStateCardView.LANGUAGE_RU, "rw", "sa", DataConstant.KEY_SLEEP_STATE, "sc", "sd", com.twitter.sdk.android.core.internal.scribe.b.b, "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", Command.SCREEN_ON, "sr", UserDataStore.STATE, "su", com.alipay.sdk.m.s.a.r, "sx", "sy", "sz", "tc", "td", "tf", "tg", "th", "tj", AuthHandler.c, "tl", "tm", "tn", "to", "tr", com.google.android.exoplayer2.text.ttml.b.n, Configs.Params.TV, "tw", "tz", "ua", "ug", "uk", Configs.Params.US, "uy", "uz", "va", "vc", "ve", "vg", "vi", "vn", "vu", "wf", "ws", "xn--3e0b707e", "xn--45brj9c", "xn--80ao21a", "xn--90a3ac", "xn--90ais", "xn--clchc0ea0b2g2a9gcd", "xn--d1alf", "xn--e1a4c", "xn--fiqs8s", "xn--fiqz9s", "xn--fpcrj9c3d", "xn--fzc2c9e2c", "xn--gecrj9c", "xn--h2brj9c", "xn--j1amh", "xn--j6w193g", "xn--kprw13d", "xn--kpry57d", "xn--l1acc", "xn--lgbbat1ad8j", "xn--mgb9awbf", "xn--mgba3a4f16a", "xn--mgbaam7a8h", "xn--mgbayh7gpa", "xn--mgbbh1a71e", "xn--mgbc0a9azcg", "xn--mgberp4a5d4ar", "xn--mgbpl2fh", "xn--mgbtx2b", "xn--mgbx4cd0ab", "xn--mix891f", "xn--node", "xn--o3cw4h", "xn--ogbpf8fl", "xn--p1ai", "xn--pgbs0dh", "xn--qxam", "xn--s9brj9c", "xn--wgbh1c", "xn--wgbl6a", "xn--xkc2al3hye2a", "xn--xkc2dl3a5ee0h", "xn--y9a3aq", "xn--yfro4i67o", "xn--ygbi2ammx", "ye", "yt", "za", "zm", "zw"};
    private static final String[] n = {"localdomain", "localhost"};
    private static boolean o = false;
    private static volatile String[] p = null;
    private static volatile String[] q = null;
    private static volatile String[] r = null;
    private static volatile String[] s = null;
    private static final long serialVersionUID = -4407125112880174009L;
    private final boolean a;
    private final com.datatheorem.android.trustkit.config.a b = new com.datatheorem.android.trustkit.config.a(h);
    private final com.datatheorem.android.trustkit.config.a c = new com.datatheorem.android.trustkit.config.a(f);

    public enum ArrayType {
        GENERIC_PLUS,
        GENERIC_MINUS,
        COUNTRY_CODE_PLUS,
        COUNTRY_CODE_MINUS,
        GENERIC_RO,
        COUNTRY_CODE_RO,
        INFRASTRUCTURE_RO,
        LOCAL_RO
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ArrayType.values().length];
            a = iArr;
            try {
                iArr[ArrayType.COUNTRY_CODE_MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ArrayType.COUNTRY_CODE_PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ArrayType.GENERIC_MINUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ArrayType.GENERIC_PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ArrayType.COUNTRY_CODE_RO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ArrayType.GENERIC_RO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ArrayType.INFRASTRUCTURE_RO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ArrayType.LOCAL_RO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class b {
        private static final boolean a = b();

        private b() {
        }

        private static boolean b() {
            return "a.".equals(IDN.toASCII("a."));
        }
    }

    static {
        String[] strArr = new String[0];
        e = strArr;
        p = strArr;
        q = strArr;
        r = strArr;
        s = strArr;
    }

    private DomainValidator(boolean z) {
        this.a = z;
    }

    private static boolean a(String[] strArr, String str) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    private String b(String str) {
        return str.startsWith(".") ? str.substring(1) : str;
    }

    public static synchronized void c() {
        o = false;
        String[] strArr = e;
        p = strArr;
        r = strArr;
        q = strArr;
        s = strArr;
    }

    public static synchronized DomainValidator e() {
        o = true;
        return i;
    }

    public static synchronized DomainValidator f(boolean z) {
        o = true;
        if (z) {
            return j;
        }
        return i;
    }

    public static String[] g(ArrayType arrayType) {
        String[] strArr;
        switch (a.a[arrayType.ordinal()]) {
            case 1:
                strArr = r;
                break;
            case 2:
                strArr = p;
                break;
            case 3:
                strArr = s;
                break;
            case 4:
                strArr = q;
                break;
            case 5:
                strArr = m;
                break;
            case 6:
                strArr = l;
                break;
            case 7:
                strArr = k;
                break;
            case 8:
                strArr = n;
                break;
            default:
                throw new IllegalArgumentException("Unexpected enum value: " + arrayType);
        }
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    private static boolean h(String str) {
        if (str == null) {
            return true;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > 127) {
                return false;
            }
        }
        return true;
    }

    public static String q(String str) {
        if (h(str)) {
            return str;
        }
        try {
            String ascii = IDN.toASCII(str);
            if (b.a) {
                return ascii;
            }
            int length = str.length();
            if (length == 0) {
                return str;
            }
            char cCharAt = str.charAt(length - 1);
            if (cCharAt != '.' && cCharAt != 12290 && cCharAt != 65294 && cCharAt != 65377) {
                return ascii;
            }
            return ascii + ".";
        } catch (IllegalArgumentException unused) {
            return str;
        }
    }

    public static synchronized void r(ArrayType arrayType, String[] strArr) {
        if (o) {
            throw new IllegalStateException("Can only invoke this method before calling getInstance");
        }
        String[] strArr2 = new String[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            strArr2[i2] = strArr[i2].toLowerCase(Locale.ENGLISH);
        }
        Arrays.sort(strArr2);
        switch (a.a[arrayType.ordinal()]) {
            case 1:
                r = strArr2;
                break;
            case 2:
                p = strArr2;
                break;
            case 3:
                s = strArr2;
                break;
            case 4:
                q = strArr2;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                throw new IllegalArgumentException("Cannot update the table: " + arrayType);
            default:
                throw new IllegalArgumentException("Unexpected enum value: " + arrayType);
        }
    }

    public boolean i(String str) {
        if (str == null) {
            return false;
        }
        String strQ = q(str);
        if (strQ.length() > 253) {
            return false;
        }
        String[] strArrB = this.b.b(strQ);
        if (strArrB == null || strArrB.length <= 0) {
            return this.a && this.c.a(strQ);
        }
        return p(strArrB[0]);
    }

    public boolean j(String str) {
        String strB = b(q(str).toLowerCase(Locale.ENGLISH));
        return (a(m, strB) || a(p, strB)) && !a(r, strB);
    }

    public final boolean k(String str) {
        if (str == null) {
            return false;
        }
        String strQ = q(str);
        if (strQ.length() > 253) {
            return false;
        }
        String[] strArrB = this.b.b(strQ);
        return (strArrB != null && strArrB.length > 0) || this.c.a(strQ);
    }

    public boolean m(String str) {
        String strB = b(q(str).toLowerCase(Locale.ENGLISH));
        return (a(l, strB) || a(q, strB)) && !a(s, strB);
    }

    public boolean n(String str) {
        return a(k, b(q(str).toLowerCase(Locale.ENGLISH)));
    }

    public boolean o(String str) {
        return a(n, b(q(str).toLowerCase(Locale.ENGLISH)));
    }

    public boolean p(String str) {
        String strQ = q(str);
        return (this.a && o(strQ)) || n(strQ) || m(strQ) || j(strQ);
    }
}
