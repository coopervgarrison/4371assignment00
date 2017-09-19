# 4371assignment00

09-19 08:41:03.712 4608-4608/com.example.cooper.assignment00 I/pTAG: onPause() was called
09-19 08:41:03.721 4608-4608/com.example.cooper.assignment00 I/spTAG: onStop() was called
09-19 08:41:03.721 4608-4608/com.example.cooper.assignment00 I/dTAG: onDestroy() was called
09-19 08:41:03.741 4608-4608/com.example.cooper.assignment00 I/sTAG: onStart() was called
09-19 08:41:03.744 4608-4608/com.example.cooper.assignment00 I/rTAG: onResume() was called

I got these results in logcat when I rotated the screen before I put a log in onCreate().
I assume that there would be a call of onCreate() in between onDestroy() and onStart() meaning that the activity was completely destroyed and recreated when the screen was rotated.