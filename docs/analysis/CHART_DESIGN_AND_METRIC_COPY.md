# Chart design patterns and Vietnamese metric explanations (D-1095)

Research output from an Opus agent, 2026-11-08. Source brief: `docs/DECISIONS.md` D-1095.
All numbers below come from `core/domain/src/main/kotlin/com/unified/health/core/domain/model/MetricThresholds.kt`
(`DefaultMetricThresholds.VALUES`) and `core/model/.../UserPreferences.kt`. These are the values used:

- **Steps goal:** 8,000 per day (`dailyStepGoal`, the user can change it).
- **Active calorie goal:** about **830 kcal** per day when no body profile is set. Computed from the
  code via the Mifflin-St Jeor formula for a 70 kg, 170 cm, 35-year-old reference adult, averaged
  over male and female, then × (1.55 − 1) — not a literal constant in the code.
- **Active minutes goal:** 30 minutes per day.
- **Resting HR:** 60–100 bpm.
- **HR zones:** Z1–Z5 at 50/60/70/80/90–100 % of max heart rate.
- **Sleep:** 7–9 hours.
- **SpO2:** normal 95–100 %, alert at or below 90 %.
- **Stress:** 0–29 relaxed, 30–59 normal, 60–79 medium, 80–100 high.
- **VO2max:** bands by sex and age.

**There are no thresholds for HRV, distance or workouts/pace.** Part B text for those three is
general only and contains no numbers.

---

## Part A — Chart design patterns

General rule for all metrics:
- **Day view:** no trend line. Show raw samples or hourly bars.
- **Week / Month:** show a dashed "average" line across the chart. Some metrics also get a 7-day
  moving average.
- **6-Month / Year:** one point or bar per week or month, plus a trend line. This is where a trend
  actually helps.
- **Values above the chart:** a large headline (period total or average) with the date range under
  it. Tapping a bar or point replaces the headline with that bar's value.

### 1. Steps
- **Chart:** bars. Day = 24 hourly bars. Week/Month = one bar per day. 6M = weekly average. Year =
  monthly average.
- **Goal:** a horizontal dashed line at 8,000. Days that reach the goal are drawn in full colour, the
  rest muted (Garmin/Huawei pattern).
- **Average:** in the header ("Daily average 7,420") and as a thin line in Week/Month.
- **Trend:** none on the bars. For 6M/Year, Apple shows separate "Highlights" text rather than a
  regression line.
- **Colour:** orange or red (Apple) or brand blue (Garmin). One hue.

### 2. Heart rate
- **Chart:** Day = scatter/thin line of samples, often with min–max range "capsules" per 5–15 min
  bucket (Apple). Week+ = one vertical range bar per day (min to max) with a dot/tick for resting or
  average HR.
- **Zone bands:** no normal-range shading on the everyday chart; zone colours (Z1 grey/blue → Z5 red)
  belong in workout detail only.
- **Average:** header shows the range ("58–142 bpm") and the average.
- **Trend:** none, range bars already carry the information.
- **Colour:** red or pink.

### 3. Resting heart rate
- **Chart:** line with dots, one value per day. 6M/Year: weekly or monthly average.
- **Normal band:** benefits most from a light band at 60–100 bpm behind the line.
- **Trend:** 7-day moving average in Week/Month (Garmin "7-day avg"); trend line in 6M/Year.
- **Average:** header shows the period average; latest value labelled at the right edge.
- **Colour:** darker red/pink than live HR, to distinguish the two.

### 4. Sleep
- **Chart:** Day = hypnogram (horizontal stage bars on a time axis: awake/REM/light/deep each on
  their own row). Week/Month = stacked bars per night, coloured by stage. 6M/Year = average duration
  per week/month, single-colour bars.
- **Target:** shade the 7–9 h band, or a dashed line at the sleep goal.
- **Average:** header shows "Avg 7 h 12 m" + bedtime/wake-time averages. (Garmin/Huawei also show a
  sleep score — this app must NOT compute that, D-803.)
- **Trend:** none on stacked bars; optional moving average of duration in 6M/Year.
- **Colours:** deep = dark indigo, light = blue, REM = cyan/purple, awake = orange/pink.

### 5. SpO2
- **Chart:** Day = scatter of individual readings, y-axis clamped 80–100% (never start at 0). Week+ =
  daily range bars (min–max) with an average dot.
- **Normal band:** shade 95–100% softly; dashed alert line at 90%, amber marker for readings ≤90%.
- **Trend:** not useful (values sit near top of axis) — skip except maybe Year.
- **Average:** header shows average and range.
- **Colour:** cyan/teal.

### 6. Stress
- **Chart:** Day = bars every 3–15 min, each coloured by band (Garmin/Huawei convention). Week/Month
  = daily average bars, coloured by band or stacked by time-in-band.
- **Bands:** colour bars by band rather than background shading — relaxed 0–29 blue/green, normal
  30–59 yellow, medium 60–79 orange, high 80–100 red. Legend strip under the chart.
- **Average:** header shows period average + band label.
- **Trend:** moving average in 6M/Year only.

### 7. HRV
- **Chart:** line with dots, one value/day (overnight or morning HRV, ms).
- **Normal band:** Garmin's signature pattern — a **personal baseline band** built from the user's
  own last 3 weeks, each night marked balanced/unbalanced. A population band isn't meaningful (HRV
  varies hugely between people). Show no band if under ~2–3 weeks of data.
- **Trend:** 7-day average line in Week/Month; trend line in 6M/Year.
- **Average:** header shows 7-day average + last night's value.
- **Colour:** green/teal.

### 8. VO2max
- **Chart:** line/step-line of sparse estimates, updates only after qualifying runs. Day view is
  pointless — default to Month or 6M, consider disabling Day.
- **Bands:** horizontal colour bands by age/sex — low red → below-average orange → average yellow →
  above-average green → high blue → superior purple (flattened Garmin gauge).
- **Trend:** the line itself is the trend in 6M/Year; no extra smoothing.
- **Value:** header shows latest value + category label — never a "fitness age" (D-803).

### 9. Calories (active energy)
- **Chart:** bars. Day = hourly. Week/Month = daily. 6M/Year = average per week/month.
- **Goal:** dashed line at the active-calorie goal (~830 kcal default). Optionally stronger colour
  for bars reaching goal.
- **Average:** header shows period total (Day) or daily average (Week+).
- **Trend:** none on bars.
- **Colour:** red/orange/pink, matching the "Move" ring if used.
- If total calories ever shown: stack resting energy (muted) under active energy (bright).

### 10. Active minutes
- **Chart:** bars, Week view most used (Garmin/WHO guidance is weekly, ~150 min/week).
- **Goal:** dashed daily line at 30 min; optional weekly ring/"x / 150" in header.
- **Stacking:** Garmin stacks moderate+vigorous (vigorous counts double) — only if data has
  intensity.
- **Average:** header shows period total.
- **Trend:** none; a 6M/Year average-per-week bar is enough.
- **Colour:** green, matching Apple's Exercise ring.

### 11. Distance
- **Chart:** bars per day/week/month, same structure as steps.
- **Goal:** usually none, no reference line by default.
- **Average:** header shows total + daily average; units per `UnitSystem`.
- **Trend:** none in Day/Week; optional faint moving average in 6M/Year for running-volume tracking.
- **Colour:** blue/teal, different from steps.

### 12. Workouts / pace
- **Summary chart:** bars of weekly duration/distance, optionally stacked by sport ("training
  volume").
- **Workout detail:** time-series lines for HR/pace/elevation — HR line shaded by zone colour +
  horizontal bar for time-in-zone Z1–Z5; pace axis inverted (faster = higher, Strava/Garmin
  convention).
- **Average:** dashed average-pace/HR line on detail charts; splits go in a bar list.
- **Trend:** in 6M/Year, average-pace-per-week line for the main sport.
- **Colour:** each sport keeps its own colour; zone colours grey/blue(Z1)→green→yellow→orange→red(Z5).

### Trend line by range

| Metric | Day | Week | Month | 6M | Year |
|---|---|---|---|---|---|
| Resting HR, HRV | – | 7d avg | 7d avg | trend | trend |
| VO2max | (disable) | – | line | line | line |
| Stress, Sleep duration, Distance, Pace | – | – | avg line | moving avg | moving avg |
| Steps, Calories, Active min | – | goal + avg | goal + avg | avg | avg |
| HR, SpO2 | – | – | – | – | optional |

---

## Part B — "Về chỉ số này" (tiếng Việt)

**Bước chân**
Số bước chân phản ánh mức độ vận động hằng ngày của bạn, một trong những thói quen đơn giản nhất giúp
tim mạch và cân nặng khỏe mạnh. Mục tiêu mặc định của ứng dụng là 8.000 bước mỗi ngày, và bạn có thể
điều chỉnh cho phù hợp với mình. Quan trọng là duy trì đều đặn, không cần đạt con số tuyệt đối mỗi
ngày.

**Nhịp tim**
Nhịp tim là số lần tim đập mỗi phút và thay đổi liên tục trong ngày: tăng khi bạn vận động, hồi hộp,
uống cà phê, và giảm khi nghỉ ngơi hay ngủ. Khi tập luyện, nhịp tim được chia thành 5 vùng, từ khởi
động (50–60% nhịp tim tối đa) đến tối đa (90–100%). Việc nhịp tim lên xuống trong ngày là hoàn toàn
bình thường.

**Nhịp tim nghỉ**
Nhịp tim nghỉ là nhịp tim khi bạn hoàn toàn thư giãn, thường đo vào lúc ngủ hoặc mới thức dậy. Với
người trưởng thành, khoảng 60–100 nhịp/phút được xem là bình thường. Người tập luyện đều đặn có thể
thấp hơn 60 mà vẫn khỏe mạnh. Hãy để ý xu hướng qua nhiều tuần hơn là một ngày riêng lẻ.

**Giấc ngủ**
Giấc ngủ giúp cơ thể phục hồi, củng cố trí nhớ và cân bằng tâm trạng. Người trưởng thành nên ngủ
khoảng 7–9 tiếng mỗi đêm. Ngủ đều giờ quan trọng không kém tổng thời gian ngủ. Một vài đêm ngủ ít là
chuyện thường gặp, điều đáng chú ý là thói quen kéo dài.

**SpO2 (Nồng độ oxy trong máu)**
SpO2 cho biết lượng oxy mà máu đang mang đi khắp cơ thể. Ở người khỏe mạnh, chỉ số này thường nằm
trong khoảng 95–100%. Kết quả đo từ đồng hồ có thể bị lệch nếu đeo lỏng hoặc khi cử động. Nếu chỉ số
thường xuyên ở mức 90% trở xuống, bạn nên trao đổi với bác sĩ.

**Căng thẳng**
Chỉ số căng thẳng (0–100) được ước tính từ sự thay đổi nhịp tim, phản ánh cơ thể bạn đang thư giãn hay
đang chịu áp lực. Mức 0–29 là thư giãn, 30–59 là bình thường, 60–79 là trung bình và 80–100 là cao.
Căng thẳng tăng tạm thời khi làm việc hay vận động là bình thường, hãy dành thời gian nghỉ ngơi và hít
thở sâu để cơ thể hồi phục.

**HRV (Biến thiên nhịp tim)**
HRV đo sự chênh lệch rất nhỏ về thời gian giữa các nhịp tim, cho thấy cơ thể bạn đang phục hồi tốt hay
đang mệt mỏi. Chỉ số này khác nhau rất nhiều giữa mỗi người, nên điều quan trọng là so sánh với chính
mức thường ngày của bạn. HRV giảm vài ngày có thể do thiếu ngủ, căng thẳng hoặc vừa tập nặng, và
thường sẽ trở lại khi bạn nghỉ ngơi đủ.

**VO2max**
VO2max là lượng oxy tối đa cơ thể bạn sử dụng được khi vận động, một thước đo phổ biến cho sức bền tim
phổi. Ứng dụng xếp chỉ số của bạn vào các mức từ thấp đến xuất sắc, dựa trên bảng tham chiếu chung
theo giới tính và độ tuổi. Đây chỉ là ước tính để tham khảo. Tin tốt là VO2max thường cải thiện khi
bạn tập aerobic đều đặn.

**Calo vận động**
Calo vận động là năng lượng cơ thể đốt thêm khi bạn di chuyển và tập luyện, chưa tính lượng calo cơ
thể tự tiêu hao lúc nghỉ. Nếu bạn chưa nhập thông tin cơ thể, mục tiêu mặc định là khoảng 830 kcal mỗi
ngày, tính cho một người trưởng thành vận động vừa phải. Bạn có thể tự đặt mục tiêu riêng cho phù hợp
với mình.

**Phút vận động**
Phút vận động là thời gian bạn hoạt động ở cường độ đủ để tim đập nhanh hơn, như đi bộ nhanh, đạp xe
hay chạy bộ. Mục tiêu mặc định là 30 phút mỗi ngày, mức khuyến nghị phổ biến để giữ tim mạch khỏe
mạnh. Bạn có thể chia nhỏ thành nhiều lần trong ngày, hiệu quả vẫn được cộng dồn.

**Quãng đường**
Quãng đường là tổng khoảng cách bạn đi bộ, chạy hoặc di chuyển trong ngày, được tính từ bước chân hoặc
GPS. Không có con số "chuẩn" cho mọi người. Chỉ số này hữu ích nhất khi bạn theo dõi mức độ vận động
của mình tăng dần theo thời gian.

**Bài tập / Tốc độ**
Mục này ghi lại các buổi tập của bạn: thời gian, quãng đường, nhịp tim và tốc độ (số phút cho mỗi km).
Thời gian ở từng vùng nhịp tim cho biết buổi tập nhẹ nhàng hay gắng sức. Tốc độ cải thiện dần qua nhiều
tuần là dấu hiệu sức bền đang tăng lên. Đừng lo nếu một buổi tập chậm hơn bình thường, vì thời tiết,
giấc ngủ và địa hình đều ảnh hưởng.

---

### For whoever implements this
1. The strings use the app's terms "Calo vận động", "Phút vận động" and "Nhịp tim nghỉ". Check them
   against the existing VI string resources once D-1040 (EN/VI language selection) is built, so the
   labels match.
2. **The "about 830 kcal" figure is a calculation, not a constant in the code.** If the reference
   profile or activity factor changes, either update the sentence or build it at runtime from
   `defaultActiveCalorieGoal`.
3. **Three texts quote numbers the user can change.** If the user has set their own goal, the steps,
   calorie and sleep texts should show that goal (`dailyStepGoal`, `activeCalorieGoalOverride`,
   `sleepGoalHoursOverride`) instead of the default figure.
4. The weight metric (`HealthMetricType.WEIGHT`) has a card in the feed but was not in the original
   brief, so it is not covered here — needs its own short text when implemented.
